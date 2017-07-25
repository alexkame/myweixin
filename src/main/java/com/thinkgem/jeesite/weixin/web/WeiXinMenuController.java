package com.thinkgem.jeesite.weixin.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.weixin.entity.WeiXinMenuResultType;
import com.thinkgem.jeesite.weixin.entity.weixinMenu;
import com.thinkgem.jeesite.weixin.service.WeiXinMenuService;

/**
 * @author fangyibai
 *
 */

@Controller
@RequestMapping(value = "${adminPath}/com.thinkgem.jeesite.weixin/weixinMenu")
public class WeiXinMenuController extends BaseController {

	@Autowired
	private WeiXinMenuService weiXinMenuService;

	@ModelAttribute("weixinMenu")
	public weixinMenu get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return weiXinMenuService.get(id);
		}else{
			return new weixinMenu();
		}
	}

	@RequestMapping(value = {"list", ""})
	public String list(Model model,weixinMenu menu) {
		List<weixinMenu> list = Lists.newArrayList();
		List<weixinMenu> sourcelist = weiXinMenuService.findList(menu);
		weixinMenu.sortList(list, sourcelist, weixinMenu.getRootId(), true);
        model.addAttribute("list", list);
		return "com.thinkgem.jeesite.weixin/weixinMenu/weixinMenuList";
	}

	@RequestMapping(value = "form")
	public String form(Model model,weixinMenu menu,RedirectAttributes redirectAttributes){

		Map<String, String> map = new HashMap<String, String>();
		List<WeiXinMenuResultType> list= weiXinMenuService.findPublicByMenu();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getId(), list.get(i).getName());
		}

		if (StringUtils.isBlank(menu.getId())){
			List<weixinMenu> list1 = Lists.newArrayList();
			List<weixinMenu> sourcelist = weiXinMenuService.findList(menu);
			weixinMenu.sortList(list1, sourcelist, String.valueOf(menu.getParentId()), false);
		}

		model.addAttribute("publicMap", map);
		model.addAttribute("menu", menu);
		return "com.thinkgem.jeesite.weixin/weixinMenu/weixinMenuForm";
	}


	@RequestMapping(value = "save")
	public String save(weixinMenu menu, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, menu)){
			return form(model,menu,redirectAttributes);
		}

		if(menu.getParentId()==1){
			Integer countMenuOne = weiXinMenuService.checkMenuOne(menu.getUid()+"");
			if(menu.getId()==null||"".equals(menu.getId())){
				if(countMenuOne>=3){//||countMenuOne==4
					addMessage(redirectAttributes, "菜单不能超过三个");
					return "redirect:" + adminPath + "/com/thinkgem/jeesite/weixin/weixinMenu/";
				}
			}
			if(countMenuOne>3){//||countMenuOne==4
				addMessage(redirectAttributes, "菜单不能超过三个");
				return "redirect:" + adminPath + "/com/thinkgem/jeesite/weixin/weixinMenu/";
			}
		}else{
			Integer countMenuTwo = weiXinMenuService.checkMenuTwo(menu.getParentId()+"",menu.getUid()+"");
			if(menu.getId()==null||"".equals(menu.getId())){
				if(countMenuTwo>=5){//||countMenuOne==4
					addMessage(redirectAttributes, "子菜单不能超过五个");
					return "redirect:" + adminPath + "/com/thinkgem/jeesite/weixin/weixinMenu/";
				}
			}
			if(countMenuTwo>5){
				addMessage(redirectAttributes, "子菜单不能超过五个");
				return "redirect:" + adminPath + "/com/thinkgem/jeesite/weixin/weixinMenu/";
			}
		}


		String menuname = menu.getName();
		int index = menuname.lastIndexOf(",");
		menuname = menuname.substring(index+1, menuname.length());
		menu.setName(menuname);
		weiXinMenuService.save(menu);
		addMessage(redirectAttributes, "保存菜单'" + menu.getName() + "'成功");
		return "redirect:" + adminPath + "/com/thinkgem/jeesite/weixin/weixinMenu/";
	}

	@RequestMapping(value = "delete")
	public String delete(weixinMenu menu,RedirectAttributes redirectAttributes){
		weiXinMenuService.delete(menu);
		addMessage(redirectAttributes,"删除成功");
		return "redirect:" + adminPath + "/com/thinkgem/jeesite/weixin/weixinMenu/";
	}




	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId,@RequestParam(required=false) String isShowHide, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<weixinMenu> list = weiXinMenuService.findList(new weixinMenu());
		for (int i=0; i<list.size(); i++){
			weixinMenu e = list.get(i);
			if (StringUtils.isBlank(extId) || (extId!=null && !extId.equals(e.getId()))){
				Map<String, Object> map = Maps.newHashMap();
				map.put("id", e.getId());
				map.put("pId", e.getParentId());
				map.put("name", e.getName());
				mapList.add(map);
			}
		}
		return mapList;
	}

}
