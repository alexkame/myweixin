package com.thinkgem.jeesite.weixin.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 20152015/10/1316:02
 */
public class weixinMenu extends DataEntity<weixinMenu> {
	// private String id;
	private Integer uid;
	private Integer parentId;
	private String type;
	private String name;
	private String wxKey;
	private String url;
	private Integer replyConid;
    private String childName;

	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}

	//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWxKey() {
		return wxKey;
	}

	public void setWxKey(String wxKey) {
		this.wxKey = wxKey;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getReplyConid() {
		return replyConid;
	}

	public void setReplyConid(Integer replyConid) {
		this.replyConid = replyConid;
	}

	@JsonIgnore
	public static void sortList(List<weixinMenu> list,
			List<weixinMenu> sourcelist, String parentId, boolean cascade) {
		for (int i = 0; i < sourcelist.size(); i++) {
			weixinMenu e = sourcelist.get(i);
			if (e.getParentId() != null
					&& String.valueOf(e.getParentId()).equals(parentId)) {
				list.add(e);
				if (cascade) {
					// 判断是否还有子节点, 有则继续获取子节点
					for (int j = 0; j < sourcelist.size(); j++) {
						weixinMenu child = sourcelist.get(j);
						if (child.getParentId() != null
								&& String.valueOf(child.getParentId()).equals(
										e.getId())) {
							sortList(list, sourcelist, e.getId(), true);
							break;
						}
					}
				}
			}
		}
	}

	@JsonIgnore
	public static String getRootId() {
		return "1";
	}
}
