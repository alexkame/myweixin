package com.thinkgem.jeesite.weixin.entity;

/**
 * <p>Description: []</p>
 * Created on 20152015/10/2616:12
 *
 */
public class AppUserBanks {

    private Integer id;
    private Integer user_id;
    private String province_city;
    private String bankName;
    private String kaihuhang;
    private String creditName;
    private String bankCardNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getProvince_city() {
        return province_city;
    }

    public void setProvince_city(String province_city) {
        this.province_city = province_city;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getKaihuhang() {
        return kaihuhang;
    }

    public void setKaihuhang(String kaihuhang) {
        this.kaihuhang = kaihuhang;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }
}
