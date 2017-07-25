package com.thinkgem.jeesite.weixin.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: [微信button]</p>
 * Created on 20152015/10/1316:11
 *
 */
public class weixinButton {
    private String name;
    private String key;
    private String type;
    private String url;
    private List<weixinSub_button> sub_button = new ArrayList<weixinSub_button>();
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<weixinSub_button> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<weixinSub_button> sub_button) {
        this.sub_button = sub_button;
    }
}
