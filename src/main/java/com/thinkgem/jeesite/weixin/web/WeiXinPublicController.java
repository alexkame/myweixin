//package com.thinkgem.jeesite.weixin.web;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.thinkgem.jeesite.common.config.Global;
//import com.thinkgem.jeesite.common.persistence.Page;
//import com.thinkgem.jeesite.common.utils.StringUtils;
//import com.thinkgem.jeesite.common.web.BaseController;
//import com.thinkgem.jeesite.modules.com.thinkgem.jeesite.weixin.entity.WeixinAccountPublic;
//import com.thinkgem.jeesite.modules.com.thinkgem.jeesite.weixin.service.WeiXinPublicService;
//
///**
// * @author fangyibai
// *
// */
//
//@Controller
//@RequestMapping(value = "${adminPath}/com.thinkgem.jeesite.weixin/weixinAccount")
//public class WeiXinPublicController extends BaseController {
//
//	@Autowired
//	private WeiXinPublicService weiXinPublicService;
//
//	@ModelAttribute
//	public WeixinAccountPublic get(@RequestParam(required=false) String id){
//		WeixinAccountPublic entity = null;
//		if(StringUtils.isNotBlank(id)){
//			entity = weiXinPublicService.get(id);
//		}
//		if(entity==null){
//			entity = new WeixinAccountPublic();
//		}
//		return entity;
//	}
//
//	/**
//	 * 公众帐号列表查询
//	 * @return
//	 */
//	@RequestMapping(value = {"list", ""})
//	public String list(WeixinAccountPublic weixinAccountPublic,HttpServletRequest request, HttpServletResponse response, Model model){
//		Page<WeixinAccountPublic> page = weiXinPublicService.findPage(new Page<WeixinAccountPublic>(request, response), weixinAccountPublic);
//		model.addAttribute("page", page);
//		return "com.thinkgem.jeesite.weixin/weixinpublic/weiXinList";
//	}
//
//	@RequestMapping(value = "form")
//	public String form(WeixinAccountPublic weixinAccountPublic,Model model){
//		model.addAttribute("wx", weixinAccountPublic);
//		return "com.thinkgem.jeesite.weixin/weixinpublic/weiXinForm";
//	}
//
//	@RequestMapping(value = "save")
//	public String save(WeixinAccountPublic weixinAccountPublic,Model model,RedirectAttributes redirectAttributes){
//		if (!beanValidator(model, weixinAccountPublic)){
//			return form(weixinAccountPublic, model);
//		}
//		weiXinPublicService.save(weixinAccountPublic);
//		addMessage(redirectAttributes, "保存成功");
//		return "redirect:"+Global.getAdminPath()+"/com.thinkgem.jeesite.weixin/weixinAccount/?repage";
//	}
//
//	@RequestMapping(value="delete")
//	public String delete(WeixinAccountPublic weixinAccountPublic,RedirectAttributes redirectAttributes){
//		weiXinPublicService.delete(weixinAccountPublic);
//		addMessage(redirectAttributes, "删除成功");
//		return "redirect:"+Global.getAdminPath()+"/com.thinkgem.jeesite.weixin/weixinAccount/?repage";
//	}
//
//}
