package com.thinkgem.jeesite.weixin.entity;

/**
 * <p>Description: []</p>
 * Created on 20152015/10/2317:24
 */
public class WeixinTicket {

    private String errcode;
    private String errmsg;
    private String ticket;
    private String expires_in;


    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }
}
