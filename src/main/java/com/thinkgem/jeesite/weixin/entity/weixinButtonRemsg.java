package com.thinkgem.jeesite.weixin.entity;

/**
 * <p>Description: [微信生成菜单按钮返回信息接收{"errcode":0,"errmsg":"ok"}]</p>
 * Created on 20152015/10/1314:05
 *
 */
public class weixinButtonRemsg {
    private String errcode;
    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    @Override
    public String toString() {
        return "weixinButtonRemsg{" +
                "errcode='" + errcode + '\'' +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
