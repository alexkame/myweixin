package com.thinkgem.jeesite.weixin.utils;

public class weixinStatic {
    public static final String  getAccessTokenUrl="https://api.com.thinkgem.jeesite.weixin.qq.com/cgi-bin/token";//accessToken 的URL
    public static final String grant_type ="client_credential"; //获得的accessToken的grant_type
    public static final String weixinButtonUrl = "https://api.com.thinkgem.jeesite.weixin.qq.com/cgi-bin/menu/create";//创建微信按钮导航
    public static final String MESSAGE_TEXT = "text";
    public static final String MESSAGE_NEWS = "news";
    public static final String MESSAGE_IMAGE = "image";
    public static final String MESSAGE_VOICE = "voice";
    public static final String MESSAGE_MUSIC = "music";
    public static final String MESSAGE_VIDEO = "video";
    public static final String MESSAGE_LINK = "link";
    public static final String MESSAGE_LOCATION = "location";
    public static final String MESSAGE_EVNET = "event";
    public static final String MESSAGE_SUBSCRIBE = "subscribe";
    public static final String MESSAGE_UNSUBSCRIBE = "unsubscribe";
    public static final String MESSAGE_CLICK = "click";
    public static final String MESSAGE_VIEW = "view";
    public static final String MESSAGE_SCANCODE= "scancode_push";
    public static final Integer MenuTypeClick=1;
    public static final Integer MenuTypeView=2;
    public static final String appid="wx52d29d3f46dcb339";
    public static final String redirectUrl="http://camelot.xicp.net/se-health/medicine-shop/automaticLogin";
    //根据code获得openid
    public static final String getAppid = "https://api.com.thinkgem.jeesite.weixin.qq.com/sns/oauth2/access_token";

    public static final String  appID ="wx52d29d3f46dcb339";
    public static final String  appsecret ="e4f50fd3f5b4bb17ff0957642d00fd39";
    //获得ticket
    public static final String  getticket="https://api.com.thinkgem.jeesite.weixin.qq.com/cgi-bin/ticket/getticket";
    //公众号的id 之后维护到属性文件中
    public static final String gid="2";

    //京东万象接口API
    public static final String chatUrl= "https://way.jd.com/turing/turing";

    public static final String jdAppKey="8a390d488949baa5af4322deaee542bc";
}