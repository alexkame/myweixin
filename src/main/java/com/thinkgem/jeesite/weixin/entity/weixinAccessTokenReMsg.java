package com.thinkgem.jeesite.weixin.entity;
/**
 * 
* @ClassName: weixinAccessTokenReMsg 
* @Description: TODO(转成JSON) 
* @date 2015年10月13日 上午9:55:47
*{"access_token":"ACCESS_TOKEN","expires_in":7200}
 */
public class weixinAccessTokenReMsg {
    
	private String access_token;
	private String expires_in;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	@Override
	public String toString() {
		return "weixinAccessTokenReMsg [access_token=" + access_token
				+ ", expires_in=" + expires_in + "]";
	}
}
