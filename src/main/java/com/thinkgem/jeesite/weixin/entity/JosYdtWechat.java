package com.thinkgem.jeesite.weixin.entity;

import java.util.Date;

public class JosYdtWechat {
	private String id;
	
	private String openid;
	
	private String mobile;
	
	private String captcha;
	
	private String userid;
	
	private String qrscene;
	
	private Date follow;
	
	private Date expire;
	
	private Date bindtime;
	
	private String retry;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getQrscene() {
		return qrscene;
	}

	public void setQrscene(String qrscene) {
		this.qrscene = qrscene;
	}

	public Date getFollow() {
		return follow;
	}

	public void setFollow(Date follow) {
		this.follow = follow;
	}

	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public Date getBindtime() {
		return bindtime;
	}

	public void setBindtime(Date bindtime) {
		this.bindtime = bindtime;
	}

	public String getRetry() {
		return retry;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	
}
