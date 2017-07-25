package com.thinkgem.jeesite.weixin.entity;

import com.thinkgem.jeesite.common.persistence.DataEntity;

public class WeixinAccountPublic extends DataEntity<WeixinAccountPublic> {
	private String id;
	private String name;
	private String weChatID;
	private String type;
	private String introduce;
	private String appid;
	private String appSecret;
	private String token;
	private String verifyStatus;
	private String originalId;
	private String wxConfUrl;
	private String reply;
	private String wxPassword;

	public String getWxPassword() {
		return wxPassword;
	}

	public void setWxPassword(String wxPassword) {
		this.wxPassword = wxPassword;
	}

	public String getVerifyStatus() {
		return verifyStatus;
	}

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getOriginalId() {
		return originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}

	public String getWxConfUrl() {
		return wxConfUrl;
	}

	public void setWxConfUrl(String wxConfUrl) {
		this.wxConfUrl = wxConfUrl;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
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
