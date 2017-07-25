package com.thinkgem.jeesite.weixin.service;


import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.thinkgem.jeesite.weixin.dao.WeiXinMenuDao;
import com.thinkgem.jeesite.weixin.entity.WeiXinMenuResultType;
import com.thinkgem.jeesite.weixin.entity.weixinMenu;

import java.util.List;


/**
 * @author fangyibai
 *
 */
@Service
@Transactional(readOnly = true)
public class WeiXinMenuService extends CrudService<WeiXinMenuDao, weixinMenu> {

	@Autowired
	WeiXinMenuDao dao;

	public weixinMenu get(String id){
		return super.get(id);
	}

	public List<weixinMenu> findList(weixinMenu menu){
		return super.findList(menu);
	}

	public Page<weixinMenu> findPage(Page<weixinMenu> page, weixinMenu menu){
		return super.findPage(page, menu);
	}

	@Transactional(readOnly = false)
	public void save(weixinMenu menu){
		super.save(menu);
	}

	@Transactional(readOnly = false)
	public void delete(weixinMenu menu){
		super.delete(menu);
	}

	public List<WeiXinMenuResultType> findPublicByMenu(){
		return dao.findPublicByMenu();
	}

	public Integer checkMenuOne(String uid){
		return dao.checkMenuOne(uid);
	}

	public Integer checkMenuTwo(String id,String uid){
		return dao.checkMenuTwo(id,uid);
	}

}
