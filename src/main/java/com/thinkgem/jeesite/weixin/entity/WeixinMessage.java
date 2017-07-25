package com.thinkgem.jeesite.weixin.entity;

import com.thinkgem.jeesite.weixin.demon.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
/**
 * <p>Description: []</p>
 * Created on 20152015/10/1417:35
 */
@XStreamAlias("xml")
public class WeixinMessage {

    @XStreamAlias("ToUserName")
    @XStreamConverter(XStreamCDataConverter.class)
    private String toUserName;

    @XStreamAlias("FromUserName")
    @XStreamConverter(XStreamCDataConverter.class)
    private String fromUserName;

    @XStreamAlias("CreateTime")
    @XStreamConverter(XStreamCDataConverter.class)
    private Long createTime;

    @XStreamAlias("MsgType")
    @XStreamConverter(XStreamCDataConverter.class)
    private String msgType;

    @XStreamAlias("MsgId")
    @XStreamConverter(XStreamCDataConverter.class)
    private String msgId;

    @XStreamAlias("Url")
    @XStreamConverter(XStreamCDataConverter.class)
    private String url;

    @XStreamAlias("Event")
    @XStreamConverter(XStreamCDataConverter.class)
    private String event;

    @XStreamAlias("EventKey")
    @XStreamConverter(XStreamCDataConverter.class)
    private String eventKey;

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}