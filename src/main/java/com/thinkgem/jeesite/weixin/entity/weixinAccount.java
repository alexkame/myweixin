package com.thinkgem.jeesite.weixin.entity;

public class weixinAccount {
    private Integer id;
    private String name;
    private String weChatID;
    private char type;
    private String introduce;
    private String appid;
    private String appSecret;
    private String token;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeChatID() {
		return weChatID;
	}
	public void setWeChatID(String weChatID) {
		this.weChatID = weChatID;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "weixinAccount [id=" + id + ", name=" + name + ", weChatID="
				+ weChatID + ", type=" + type + ", introduce=" + introduce
				+ ", appid=" + appid + ", appSecret=" + appSecret + ", token="
				+ token + "]";
	}
    
}
