package com.thinkgem.jeesite.weixin.service;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.thinkgem.jeesite.common.mapper.JsonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.weixin.dao.WeiXinDao;
import com.thinkgem.jeesite.weixin.entity.*;
import com.thinkgem.jeesite.weixin.utils.weixinStatic;
import com.thinkgem.jeesite.weixin.utils.weixinUtils;

@Service@Lazy(false)
@Transactional
public class WeiXinService {
	@Autowired
    private WeiXinDao weixinDao;
    private static final Logger LOGGER = LoggerFactory
            .getLogger(WeiXinService.class);
	public List<weixinAccount> getParams() {
		List<weixinAccount> account = weixinDao.getParams();
		return account;
	}
    public String getAccessTokenById(String id){
		return weixinDao.getAccessTokenById(id);
	}

	public void updateWeixinAccesstoken(weixinAccesstoken wxat){
		weixinDao.updateWeixinAccesstoken(wxat);
	}

	public void addWeixinAccesstoken(weixinAccesstoken wxat) {
		weixinDao.addWeixinAccesstoken(wxat);
	}

	public String getWeixinSubscribe() {
		return weixinDao.getWeixinSubscribe();
	}

	public weixinButton getWeixinMenu(String id) {
		 return weixinDao.getWeixinMenu(id);
	}

	public List<weixinMenu> getMenuTop() {
		return weixinDao.getMenuTop();
	}

	public List<weixinSub_button> getMenuChild(String id) {

		return weixinDao.getMenuChild(id);
	}

	public Integer checkWeixinUser(String code) {
		return weixinDao.checkWeixinUser(code);
	}

	/**
	 * 用户关注保存用户信息
	 * @param xmlMessage
	 */
	public void addWeixinAccount(String xmlMessage) {
		weixinDao.addWeixinAccount(xmlMessage);
	}

	/**
	 * 根据openId得到用户的手机号码
	 * @param code
	 * @return
	 */
	public String getWechatPhoneNum(String code) {
		return weixinDao.getWechatPhoneNum(code);
	}

	/**
	 * 取消关注删除用户信息
	 * @param fromUserName
	 */
	public void deleteWeixinAccount(String fromUserName) {
		weixinDao.deleteWeixinAccount(fromUserName);
	}

//	public JosUsers getJosUsersByOpenid(weixinDao appid) {
//		return weixinDao.getJosUsersByOpenid(appid);
//	}

	public String getJsapiTicket(String gid) {
		return weixinDao.getJsapiTicket(gid);
	}

	public List<AppBanks> getAllBank() {
		return weixinDao.getAllBank();
	}

	public List<AppUserBanks> getUserBank(String id) {
		return weixinDao.getUserBank(id);
	}

	public void deleteUserBank(AppUserBanks appUserBanks) {
		 weixinDao.deleteUserBank(appUserBanks);
	}
	public void saveUserBank(AppUserBanks appUserBanks) {
		weixinDao.saveUserBank(appUserBanks);
	}
	@Scheduled(cron = "0 0 0/1 * * ?")
	public void getAccessToken() {
		LOGGER.info("获取微信accessToken开始执行7200秒调用一次");
		List<weixinAccount> account  =  getParams();//公众号ID
		Map<String, String> map = new HashMap<String, String>();
		map.put("grant_type", weixinStatic.grant_type);
		for (weixinAccount weixinAccount : account) {
			map.put("appid", weixinAccount.getAppid());
			map.put("secret", weixinAccount.getAppSecret());
			String returnMsg = weixinUtils.sendRequest(weixinStatic.getAccessTokenUrl, map);
			if(returnMsg!=null){
				try{
					weixinAccessTokenReMsg weixinReMsg =  (weixinAccessTokenReMsg) JsonMapper.fromJsonString(returnMsg, weixinAccessTokenReMsg.class);
					if(weixinReMsg!=null){
						weixinAccesstoken wxat =  new weixinAccesstoken();
						wxat.setAccess_number(new Date());
						wxat.setGid(weixinAccount.getId());
						wxat.setToken(weixinReMsg.getAccess_token());
						wxat.setValid_time(new Date());
						String accessToken = getAccessTokenById(String.valueOf(weixinAccount.getId()));
						//根据Access_token获得到jsapi_ticket
						Map<String, String> ticketMap = new HashMap<String, String>();
						ticketMap.put("access_token",weixinReMsg.getAccess_token());
						ticketMap.put("type", "jsapi");
						String ticketMsg = weixinUtils.sendRequest(weixinStatic.getticket, ticketMap);
						WeixinTicket weixinTicket = JSON.parseObject(ticketMsg, WeixinTicket.class);
						wxat.setTicket(weixinTicket.getTicket());
						if(accessToken!=null){
							updateWeixinAccesstoken(wxat);
						}else{
							addWeixinAccesstoken(wxat);
						}
					}
				}catch (Exception e){
					LOGGER.info("微信获得AccessToken失败json转换异常"+e);
					e.printStackTrace();
				}
			}
		}
	}

}
