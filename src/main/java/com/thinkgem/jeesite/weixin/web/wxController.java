package com.thinkgem.jeesite.weixin.web;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.thinkgem.jeesite.weixin.demon.WxMpXmlMessage;
import com.thinkgem.jeesite.weixin.entity.JDCheat;
import com.thinkgem.jeesite.weixin.entity.WeixinResponseMessage;
import com.thinkgem.jeesite.weixin.utils.GetXstream;
import com.thoughtworks.xstream.XStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.common.web.BaseController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.thinkgem.jeesite.weixin.utils.weixinStatic;
import com.thinkgem.jeesite.weixin.utils.weixinUtils;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * @ClassName: wxController
 * @Description:(微信Controller)
 * @date 2015年10月12日 下午3:31:26
 */
@Controller
@RequestMapping("/weixin")
public class wxController extends BaseController {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(wxController.class);

    @RequestMapping("check")
    /**
     * @Title: checkWeiXin
     * @Description: (接入微信)
     * @param request
     * @param response    设定文件
     * @return void    返回类型
     * @throws
     */
    public void checkWeiXin(HttpServletRequest request,
                            HttpServletResponse response) {
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            if (weixinUtils.checkSignature(signature, timestamp, nonce)) {
                out.print(echostr);
            }
        } catch (IOException e) {
            LOGGER.info("微信校验失败" + e);
            e.printStackTrace();
        }
    }

    /**
     * @param request
     * @param response 设定文件
     * @return void    返回类型
     * @throws
     * @Title: checkWeiXin
     * @Description: (处理微信回推信息)
     */
    @RequestMapping(value = "check", method = RequestMethod.POST)
    public void weixinMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String returnMessage = "";
        XStream xs = new XStream();
        xs.processAnnotations(WxMpXmlMessage.class);
        xs.autodetectAnnotations(true);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/xml");
        try {
            WxMpXmlMessage xmlMessage = (WxMpXmlMessage) xs.fromXML(request.getInputStream());

            if (xmlMessage.getEvent() != null && xmlMessage.getEvent().equals("subscribe")) {
                String result ="欢迎关注灰名单征审公众号，在这里你可以查询自己是否在灰名单中。主页地址:http://camelot.xicp.net/weixin/index.jsp";
                response.getWriter().write(resultMessage(xmlMessage,result));

            } else if (xmlMessage.getEvent() != null && xmlMessage.getEvent().equals("unsubscribe")) {
            }
            if (xmlMessage.getEvent() != null && xmlMessage.getEvent().equals("CLICK")) {
            }
            if ("text".equals(xmlMessage.getMsgType())) {
                //调用聊天机器人
                String chatResult = callChat(xmlMessage.getContent());
                String message =  resultMessage(xmlMessage,chatResult) ;
                response.getWriter().write(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String resultMessage(WxMpXmlMessage xmlMessage, String result) {
        WeixinResponseMessage xmlMessge = new WeixinResponseMessage();
        xmlMessge.setToUserName(xmlMessage.getFromUserName());
        xmlMessge.setFromUserName(xmlMessage.getToUserName());
        xmlMessge.setCreateTime(new Date().getTime());
        xmlMessge.setMsgType("text");
        xmlMessge.setContent(result);
        XStream xstream = GetXstream.getXstream();
        xstream.alias("xml", xmlMessge.getClass());
        String xml = xstream.toXML(xmlMessge);
        return xml;
    }


    /**
     * 调用聊天机器人
     *
     * @param content
     * @return
     */
    public String callChat(String content) {
        Map<String, String> infoMap = new HashMap<String, String>();
        infoMap.put("appkey", weixinStatic.jdAppKey);
        infoMap.put("info", content);
        String resultMessage = weixinUtils.sendRequestParam(weixinStatic.chatUrl, infoMap);
        JDCheat jdCheat = JSON.parseObject(resultMessage, JDCheat.class);
        return jdCheat.getResult().getText();
    }

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping("toIndex")
    public String toIndex(){
        return "/weixin/index";
    }






    /**
     *
     * @Title: getAccessToken
     * @Description:(获得微信AccessToken,刷新jsapi)
     *            设定文件
     * @return void 返回类型
     * @throws
     */
//    @RequestMapping("getAccessToken")
//    public void getAccessToken() {
//        LOGGER.info("获取微信accessToken开始执行");
//	    List<weixinAccount> account  =  weixinService.getParams();//公众号ID
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("grant_type", weixinStatic.grant_type);
//		for (weixinAccount weixinAccount : account) {
//			map.put("appid", weixinAccount.getAppid());
//			map.put("secret", weixinAccount.getAppSecret());
//			String returnMsg = weixinUtils.sendRequest(weixinStatic.getAccessTokenUrl, map);
//            if(returnMsg!=null){
//                try{
//                    weixinAccessTokenReMsg weixinReMsg =  (weixinAccessTokenReMsg) JsonMapper.fromJsonString(returnMsg, weixinAccessTokenReMsg.class);
//                    if(weixinReMsg!=null){
//                        weixinAccesstoken wxat =  new weixinAccesstoken();
//                        wxat.setAccess_number(new Date());
//                        wxat.setGid(weixinAccount.getId());
//                        wxat.setToken(weixinReMsg.getAccess_token());
//                        wxat.setValid_time(new Date());
//                        String accessToken = weixinService.getAccessTokenById(String.valueOf(weixinAccount.getId()));
//                        //根据Access_token获得到jsapi_ticket
//                        Map<String, String> ticketMap = new HashMap<String, String>();
//                        ticketMap.put("access_token",weixinReMsg.getAccess_token());
//                        ticketMap.put("type", "jsapi");
//                        String ticketMsg = weixinUtils.sendRequest(weixinStatic.getticket, ticketMap);
//                        WeixinTicket weixinTicket = JSON.parseObject(ticketMsg, WeixinTicket.class);
//                        wxat.setTicket(weixinTicket.getTicket());
//                        if(accessToken!=null){
//                            weixinService.updateWeixinAccesstoken(wxat);
//                        }else{
//                            weixinService.addWeixinAccesstoken(wxat);
//                        }
//                    }
//                }catch (Exception e){
//                    LOGGER.info("微信获得AccessToken失败json转换异常"+e);
//                    e.printStackTrace();
//                }
//            }
//
//		}
//	}
//
//    /**
//     *
//     * @Title: setWeixinButton
//     * @Description:(设置微信按钮导航)
//     *            设定文件
//     * @return void 返回类型
//     * @throws
//     */
//    @SuppressWarnings("InfiniteLoopStatement")
//    @ResponseBody
//    @RequestMapping("addWeixinMenu")
//    public String setWeixinButton(String id){
//        String returnCode="";
//       Map map = new HashMap<String, String>();
//        //获得对应平台的access_token
//        String accessToken =  weixinService.getAccessTokenById("2");
//        //查询按钮信息组装按钮
//        List<weixinMenu> WeixinMenu =weixinService.getMenuTop();
//        WeixinButtonTop weixinButtonTop = new WeixinButtonTop();
//        for(weixinMenu wxMenu:WeixinMenu){
//            weixinButton weixinButton =new weixinButton();
//            List<weixinSub_button> weixinSub_button = weixinService.getMenuChild(wxMenu.getId());
//            //没有子菜单
//            if(weixinSub_button.size()==0){
//                switch(Integer.parseInt(wxMenu.getType())){
//                    case 1 : weixinButton.setType(weixinStatic.MESSAGE_CLICK);weixinButton.setUrl(null); ;break;
//                    case 2 : weixinButton.setType(weixinStatic.MESSAGE_VIEW); weixinButton.setKey(null);break;
//                }
//                weixinButton.setName(wxMenu.getName());
//                weixinButton.setKey(wxMenu.getWxKey());
//                weixinButton.setUrl(wxMenu.getUrl());
//                weixinButton.setSub_button(null);
//                weixinButtonTop.getButton().add(weixinButton);
//            }else{
//                //包含子菜单
//                for(weixinSub_button wxbutton:weixinSub_button){
//                    switch(Integer.parseInt(wxbutton.getType())){
//
//                        case 1 : wxbutton.setType(weixinStatic.MESSAGE_CLICK) ;wxbutton.setUrl(null);break;
//                        case 2 : wxbutton.setType(weixinStatic.MESSAGE_VIEW); wxbutton.setKey(null);break;
//                    }
//                    weixinButton.getSub_button().add(wxbutton);
//                }
//                weixinButton.setName(wxMenu.getName());
//                weixinButtonTop.getButton().add(weixinButton);
//            }
//        }
//        String json = JSON.toJSONString(weixinButtonTop);
//        HttpUriRequest httpUriRequest = RequestBuilder.post().setUri("https://api.weixin.qq.com/cgi-bin/menu/create").addParameter("access_token", accessToken).setEntity(new StringEntity(json, Consts.UTF_8)).build();
//        String returnMsg = HttpUtil.getResponseString(httpUriRequest);
//        if(returnMsg!=null){
//            try{
//                weixinButtonRemsg msg = (weixinButtonRemsg)JsonMapper.fromJsonString(returnMsg, weixinButtonRemsg.class);
//                returnCode = msg.getErrcode();
//            }catch (Exception e){
//                LOGGER.info("微信按钮修改json转换异常"+e);
//                e.printStackTrace();
//            }
//        }
//        return returnCode;
//    }

    /**
     * 微信授权页面
     * 添加session
     */
    @RequestMapping("/automaticGetOpenId")
    public String automaticGetOpenId(String type, HttpSession session, HttpServletRequest request) {
        LOGGER.info("微信开始授权");
        String path = request.getRequestURI();
        path = path.substring(0, path.length() - 18);
        String basePath = request.getScheme() + "://" + request.getServerName() + path + "automaticLogin";
        String url = weixinUtils.genOauth2Url(weixinStatic.appid,
                basePath, false, type);
        return "redirect:" + url;
    }
//
//    /**
//     * 微信授权页面授权成功之后，会重定向到上一步设置的回调url，包含参数code，可以根据code获得用户的openid
//     * 授权不成功也会跳转到这儿，只是没有code参数
//     * 实现功能转发
//     * @return
//     */
//    @RequestMapping("/automaticLogin")
//    public String automaticLogin(HttpSession session,HttpServletRequest request, HttpServletResponse response,String appid, String code,String state,Model model,String pageSize,String phoneNumber) {
//         System.out.println("CODE=" + code + "appid=" + appid + "state=" + state + "pageSize" + pageSize + "phoneNumber" + phoneNumber + "11111111111111111111111111111");
//        LOGGER.info("CODE="+code+"appid="+appid+"state="+state+"pageSize"+pageSize+"phoneNumber"+phoneNumber);
//        //code等于空的时候为登录成功
//        if(code!=null){
//            WxSnsAccessToken WxSnsAccessToken = WxSnsAPI.getOauth2AccessToken(weixinStatic.appid, weixinStatic.appsecret, code);
//            //根据code获得openid
//            appid = WxSnsAccessToken.getOpenid();
//        }
//        if(pageSize==null||pageSize==""){
//            pageSize="1";
//        }
//        String id = weixinService.getWechatPhoneNum(appid);//根据用户的openid查询对象用户的id
//        JosUsers user = josUsersService.getUserById(id);
//        //得到用户的appid 把appid保存到表中，对应不到用户信息，跳转到登录页面
//        Integer count=null;
//        count =   weixinService.checkWeixinUser(appid);
//         if(count==0){
//                model.addAttribute("openId",appid);
//                model.addAttribute("state",state);
//                return "/com.thinkgem.jeesite.weixin/login";//登录页面
//         }else if("jf".equals(state)){
//                LOGGER.info("跳转积分页面");
//                //根据code openId 查询对应的电话号码 ,userid
//                String userId = weixinService.getWechatPhoneNum(appid);
//                //查询我的积分明细
//                 Map<String,Object> userPointsMap = mobileService.getUserPoints(userId, pageSize);
//                 model.addAttribute("userPointsDetails",userPointsMap.get("userPointsDetails"));
//                 model.addAttribute("points",userPointsMap.get("data"));
//                 //查询兑换明细
//                 Map<String,Object> ehangeMap = mobileService.findPointsExchange(userId, pageSize);
//                 model.addAttribute("exchange",ehangeMap.get("data"));
//                 model.addAttribute("openId",appid);
//                return "/com.thinkgem.jeesite.weixin/my_integral";
//         }else if("grzl".equals(state)){
//             LOGGER.info("跳转到完善个人资料也");
//             String userId = weixinService.getWechatPhoneNum(appid);
//             if(pageSize==null||pageSize==""){
//                 pageSize="1";
//             }
//             //调用微信sdk 先获得jsapi_ticket,url为当前的页面
//             String ticket = weixinService.getJsapiTicket(weixinStatic.gid);
//             String path = request.getRequestURI();
//             String basePath = request.getScheme()+"://"+request.getServerName()+path;
//             Map map = weixinUtils.sign(ticket, basePath + "?code=" + code + "&state=grzl");
//             AppDoctor appDoctor =  appDoctorService.getById(user.getId());
//             model.addAttribute("JosUsers",appDoctor);
//             model.addAttribute("appid",weixinStatic.appid);
//             model.addAttribute("data",map);
//             return "/com.thinkgem.jeesite.weixin/personal_profile";
//         }else if("login".equals(state)){
//             model.addAttribute("openId",appid);
//             model.addAttribute("state","grzl");//点登录成功后跳转到个人资料页面
//             return "/com.thinkgem.jeesite.weixin/login";//跳转到登录页面,也是要有openid的
//         }else if("activity".equals(state)){
//             Map<String,Object> map = null
//                     ;
//             try {
//                 //后三个参数是省市门店
//                 map = mobileService.getActivityPage(user.getUsername(), user.getJosJsnUsers().getGroup(),"", pageSize,"","","");
//             } catch (UnsupportedEncodingException e) {
//                 e.printStackTrace();
//                 LOGGER.info("雪崩");
//             }
//             model.addAttribute("openId",appid);
//             model.addAttribute("activity",map.get("acitvity"));
//             return "/com.thinkgem.jeesite.weixin/activity_list";
//         }
//        return "/com.thinkgem.jeesite.weixin/login";//跳转到登录页面,也是要有openid的
//    }
}