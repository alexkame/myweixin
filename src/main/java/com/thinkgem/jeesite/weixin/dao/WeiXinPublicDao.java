package com.thinkgem.jeesite.weixin.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.weixin.entity.WeixinAccountPublic;

@MyBatisDao
public interface WeiXinPublicDao extends CrudDao<WeixinAccountPublic> {

}
