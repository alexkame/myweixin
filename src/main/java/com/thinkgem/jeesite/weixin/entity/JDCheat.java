package com.thinkgem.jeesite.weixin.entity;

/**
 * Created by Administrator on 2017/7/25.
 * 聊天机器人返回类
 */
public class JDCheat {
    private String code ;
    private JDCheatResult result;
    private String charge;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public JDCheatResult getResult() {
        return result;
    }

    public void setResult(JDCheatResult result) {
        this.result = result;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
