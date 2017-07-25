package com.thinkgem.jeesite.weixin.entity;

import java.util.Date;
/**
 * 
* @ClassName: weixinAccesstoken 
* @Description: TODO(实体) 
* @date 2015年10月12日 下午4:19:45
*
 */
public class weixinAccesstoken {
    private Integer id;
    private Integer gid;
    private String token;
    private Date Valid_time;
    private Integer count ;
    private Date Access_number;
	private String ticket;

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getValid_time() {
		return Valid_time;
	}
	public void setValid_time(Date valid_time) {
		Valid_time = valid_time;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getAccess_number() {
		return Access_number;
	}
	public void setAccess_number(Date access_number) {
		Access_number = access_number;
	}
	@Override
	public String toString() {
		return "weixinAccesstoken [id=" + id + ", gid=" + gid + ", token="
				+ token + ", Valid_time=" + Valid_time + ", count=" + count
				+ ", Access_number=" + Access_number + "]";
	}
    
}
