package com.thinkgem.jeesite.weixin.dao;


import java.util.List;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.weixin.entity.WeiXinMenuResultType;
import com.thinkgem.jeesite.weixin.entity.weixinMenu;

/**
 * @author fangyibai
 */
@MyBatisDao
public interface WeiXinMenuDao extends CrudDao<weixinMenu> {

	/**
	 * 菜单所属的公众号
	 * @return
	 */
	public List<WeiXinMenuResultType> findPublicByMenu();

	/**
	 * 验证一级菜单
	 * @return
	 */
	public Integer checkMenuOne(String uid);

	/**
	 * 验证二级菜单
	 * @return
	 */
	public Integer checkMenuTwo(String id, String uid);

}
