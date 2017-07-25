package com.thinkgem.jeesite.weixin.dao;


import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.weixin.entity.*;

import java.util.List;

@MyBatisDao
public interface WeiXinDao {
    /**
     * 获得应用的appid
    * @Title: getParams 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @return    设定文件 
    * @return List<weixinAccount>    返回类型 
    * @throws 
    * @author 
     */
	public List<weixinAccount> getParams();
     /**
      * 保存accessToken
     * @Title: addWeixinAccesstoken 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param wxat    设定文件
      * @return void    返回类型
     * @throws 
     * @author 
      */
	public void addWeixinAccesstoken(weixinAccesstoken wxat);
    /**
     * 查询accesstoken
     * @Title: addWeixinAccesstoken
     * @Description: TODO(查询accesstoken)
     * @throws
     */
    public String getAccessTokenById(String id);
    /**
     * 更新accesstoken
     * @Title: addWeixinAccesstoken
     * @Description: TODO(更新accesstoken)
     * @throws
     */
    public void updateWeixinAccesstoken(weixinAccesstoken wxat);

    /**
     * 获得微信关注返回信息
     * @author 
     * @return
     */
    public String getWeixinSubscribe();

    weixinButton getWeixinMenu(String id);

    List<weixinMenu> getMenuTop();

    List<weixinSub_button> getMenuChild(String id);
    /**
     * 检测用户是否登录过微信端
     * @author 
     * @return
     */
    Integer checkWeixinUser(String code);

    /**
     * 用户关注保存用户信息
     * @author 
     * @return
     * @param xmlMessage
     */
    void addWeixinAccount(String xmlMessage);

    /**
     * 查询openId的电话号码
     * @author 
     * @return
     */
    String getWechatPhoneNum(String code);
    /**
     * 取消关注删除用户信息
     * @author 
     * @return
     */
    void deleteWeixinAccount(String fromUserName);

//    /**
//     * 根据appid查询用户信息
//     * @param appid
//     * @return
//     */
//    JosUsers getJosUsersByOpenid(WeiXinDao appid);
    /**
     * 查询Ticket
     * @author 
     * @return
     */
    String getJsapiTicket(String gid);
    /**
     * 查询所有银行
     * @author 
     * @return
     */
    List<AppBanks> getAllBank();
    /**
     * 查询所有用户的银行
     * @author 
     * @return
     */
    List<AppUserBanks> getUserBank(String id);
    /**
     * 删除用户的银行
     * @author 
     * @return
     */
    void deleteUserBank(AppUserBanks userId);
    /**
     * 保存用户的银行
     * @author 
     * @return
     */
    void saveUserBank(AppUserBanks userId);
}
