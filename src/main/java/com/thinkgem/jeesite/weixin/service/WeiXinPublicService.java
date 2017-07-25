package com.thinkgem.jeesite.weixin.service;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.thinkgem.jeesite.weixin.dao.WeiXinPublicDao;
import com.thinkgem.jeesite.weixin.entity.WeixinAccountPublic;

import java.util.List;


/**
 * @author fangyibai
 *
 */
@Service
@Transactional(readOnly = true)
public class WeiXinPublicService extends CrudService<WeiXinPublicDao, WeixinAccountPublic> {

	public WeixinAccountPublic get(String id){
		return super.get(id);
	}

	public List<WeixinAccountPublic> findList(WeixinAccountPublic weixinAccountPublic){
		return super.findList(weixinAccountPublic);
	}

	public Page<WeixinAccountPublic> findPage(Page<WeixinAccountPublic> page, WeixinAccountPublic weixinAccountPublic){
		return super.findPage(page, weixinAccountPublic);
	}

	@Transactional(readOnly = false)
	public void save(WeixinAccountPublic weixinAccountPublic){
		super.save(weixinAccountPublic);
	}

	@Transactional(readOnly = false)
	public void delete(WeixinAccountPublic weixinAccountPublic){
		super.delete(weixinAccountPublic);
	}

}
