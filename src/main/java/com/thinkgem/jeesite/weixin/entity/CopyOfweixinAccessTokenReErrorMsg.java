package com.thinkgem.jeesite.weixin.entity;
/**
 * 
* @ClassName: CopyOfweixinAccessTokenReErrorMsg 
* @Description: TODO(这里用一句话描述这个类的作用) 
 */
public class CopyOfweixinAccessTokenReErrorMsg {
	
   private String errcode;
   private String appid;
   
public String getErrcode() {
	return errcode;
}
public void setErrcode(String errcode) {
	this.errcode = errcode;
}
public String getAppid() {
	return appid;
}
public void setAppid(String appid) {
	this.appid = appid;
}
@Override
public String toString() {
	return "CopyOfweixinAccessTokenReErrorMsg [errcode=" + errcode + ", appid="
			+ appid + "]";
}
}
