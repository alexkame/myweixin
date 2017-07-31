<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/31
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="wap-font-scale" content="no">
    <meta id="viewport" name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0,target-densitydpi=medium"/>
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
    <meta content="telephone=no" name="format-detection" />
    <meta content="email=no" name="format-detection" />
    <title>黑名单查询</title>

    <script>
        var home_index='1';
    </script>
    <link type="text/css" rel="stylesheet" href="css/wap/base.css" />
    <script type="text/javascript">
        var user_name = "zfhy8";
        var aGlobalBannerHeight = {};
    </script>
    <script type="text/javascript" src="include/cookies.js"></script>
    <script src="include/jquery-1.7.1.min.js" language="JavaScript" ></script>
    <script type="text/javascript" src="js/wap/nav.js?ver1"></script>
    <script type="text/javascript" src="js/wap/swipe.js?ver1"></script>
    <script type="text/javascript" src="js/wap/ajax_info.js?ver1"></script>
    <script type="text/javascript" src="js/wap/public.js?ver1"></script>
    <link type="text/css" rel="stylesheet" href="css/wap/web_frame.css??ver1" />
    <link type="text/css" rel="stylesheet" href="css/wap/change_module.css?ver1" />
    <link id="webSkinCss" type="text/css" rel="stylesheet" href="templates/wapother28/css/webskin.css?ver1" />
    <link id="webSkinCss" type="text/css" rel="stylesheet" href="templates/wapother28/skin_28/style.css?ver1" />
    <!--change_top_tpl-->
    <link type="text/css" rel="stylesheet" href="css/wap/new/index.css?ver1" >
    <!-- <link type="text/css" rel="stylesheet" href="/css/wap/classStyle.css?ver1" > -->
    <script type="text/javascript" src="js/wap/new_wap_public.js?ver1"></script>
    <script type="text/javascript" src="js/wap/wapShare.js?ver1"></script>
    <script type="text/javascript" src="js/wap/doc_json.js?ver1"></script>
    <link type="text/css" rel="stylesheet" href="css/wap/icomoon_style.css?ver1" />

    <link rel="stylesheet" href="css/wap/base.css">
    <link rel="stylesheet" href="css/wap/spectrum.css">
    <!-- 图标文字 -->
    <link rel="stylesheet" href="css/tubiao/gwcFont.css">
    <link rel="stylesheet" href="css/tubiao/indexFont.css">
    <link rel="stylesheet" href="css/tubiao/qqFont.css">
    <link rel="stylesheet" href="css/tubiao/helpFont.css">
    <link rel="stylesheet" href="css/tubiao/telFont.css">
    <link rel="stylesheet" href="css/tubiao/shopsFont.css">
    <link rel="stylesheet" href="css/tubiao/classifyFont.css">
    <link rel="stylesheet" href="css/tubiao/fxFont.css">
    <link rel="stylesheet" href="css/tubiao/hbqFont.css">
    <link rel="stylesheet" href="css/tubiao/memberFont.css">
    <link rel="stylesheet" href="css/tubiao/hykFont.css">
    <link rel="stylesheet" href="css/tubiao/kfFont.css">
    <link rel="stylesheet" href="css/tubiao/lyFont.css">
    <link rel="stylesheet" href="css/tubiao/forumFont.css">
    <link rel="stylesheet" href="css/tubiao/freeFont.css">
    <link rel="stylesheet" href="css/tubiao/tryoutFont.css">
    <link rel="stylesheet" href="css/tubiao/tgFont.css">
    <link rel="stylesheet" href="css/tubiao/positionFont.css">
    <link rel="stylesheet" href="css/tubiao/wdFont.css">
    <link rel="stylesheet" href="css/tubiao/xsgFont.css">
    <link rel="stylesheet" href="css/tubiao/yyFont.css">
    <!-- end -->
    <link rel="stylesheet" href="css/iconSet.css">
    <script src="js/tj/model_banner.js?ver1" type="text/javascript"></script>
    <script type="text/javascript" src="js/wap/move_module.js?ver1"></script>
    <link type="text/css" rel="stylesheet" href="css/wap/show.css" />
    <link type="text/css" rel="stylesheet" href="css/VNew/animate.min.css" />

</head><link type="text/css" rel="stylesheet" href="wap/include/wap_zfhy8.css" />

<body id="webBody" data-curbg="wbg_0"  data-ver = 0>
<script>
    $(function(){
        var document_h = $(window).height();
        $("#wrapper").css({"min-height":document_h+'px'});
    })
</script>
<style type="text/css">
    .mainContainer{overflow: hidden;min-height: 368px;}
</style>
<div class="wrapper" id="wrapper" data-curbg="wbg_0" >
    <link type="text/css" rel="stylesheet" href="css/wap/web_memberCenter.css" />
    <div class="header" id="header" visible="show" data-remove="true">
        <div class="headerBg"></div>
        <div class="headerCon">
            <div class="logo" id="logo">
                <a id="logo_link" href="">
                    <div style="text-align:center;">
                        <span style="line-height:2.5;color:#FFFFFF;font-size:24px;"><strong>LOGO</strong></span>
                    </div>
                </a>
            </div>
        </div>
    </div>
    <div class="webNav" id="web_nav">
        <!--NAV START-->
        <div class="nav nav_1103" id="nav" visible="show">
            <dl class="NMain">
                <dd  class="NItem NItemCur"><a class="active" id="index_link" href=""><span>&#39318;&#39029;</span></a></dd>
                <dd class="NItem "><a   href=""><span>黑名单查询</span></a></dd>
                <dd class="NItem "><a   href=""><span>人行征信查询</span></a></dd>
                <dd class="NItem "><a   href=""><span>关于我的文章</span></a></dd>
            </dl>
            <div class="navMoreBut"><i class="i-1"></i><i class="i-2"></i><i class="i-3"></i><b class="b-1"></b><b class="b-2"></b><b class="b-3"></b></div>     </div>
        <!--NAV END-->
    </div>
    <div class="mainContainer">
        <div class="addContainer q" id="add_container">
            <div  visible="show" rel="r_layout_1" lock="lock" changes="0" id="row_7"  class="customModuleRow " >
                <div class="customModule ">
                    <!--moCss-->
                    <div class="Mo " id="Mo_7" motype='12'>
                        <table class="MoT">
                            <tbody>
                            <tr>
                                <td class="MoTL"></td>
                                <td class="MoTM"></td>
                                <td class="MoTR"></td>
                            </tr>
                            </tbody>
                        </table>
                        <table class="MoHead"><tbody><tr>
                            <td class="MoHeadL"></td>
                            <td class="MoHeadM">
                                <table class="MoName">
                                    <tbody>
                                    <tr>
                                        <td class="MoNameL"></td>

                                        <td class="MoNameM">
                                            <strong class="NameTxt"> <a   href="#">111</a></strong>
                                        </td>
                                        <td class="MoNameR"></td>
                                    </tr>
                                    </tbody>
                                </table>
                                <span class="MoMore">
                                    <a   href="#">更多</a>
                                    </span>
                            </td>
                            <td class="MoHeadR"></td>
                        </tr>
                        </tbody>
                        </table>

                        <table class="MoBody"><tbody><tr>
                            <td class="MoBodyL"></td>
                            <td class="MoBodyM">
                                <div class="MoBodyC">

                                    <div class="moveModule_1" id="move_module_839986"><div class="movePicShow" rel="175" style="height:175px;"><ul class="q"><li style="height:175px;" smallpic="http://aimg8.dlszywz.com/ev_user_module_content_tmp/2017_01_10/tmp1484015708_1023893_s.jpg"><a  href="#"><img title="111" src="http://aimg8.dlszywz.com/ev_user_module_content_tmp/2017_01_10/tmp1484015708_1023893_s.jpg"></a></li></ul></div><div class="bannerNav"></div></div>				<script language="javascript">
                                    $(function() {
                                        aGlobalBannerHeight.m839986 = parseInt(175);
                                        setBannerModuleHeight839986();
                                        $(window).resize(function(){
                                            setBannerModuleHeight839986();
                                        })
                                    });

                                    function setBannerModuleHeight839986() {
                                        var Banner = $("#move_module_839986"),
                                            oBanner = $("#move_module_839986 .movePicShow"),
                                            iPicMaxWidth = 640,
                                            // iWindowWidth = $(window).width();
                                            iWindowWidth = Banner.parent().width();

                                        if (iWindowWidth > iPicMaxWidth) {
                                            var iRealityHeight = aGlobalBannerHeight.m839986*2;
                                            var iRealityWidth = iPicMaxWidth;
                                        } else if (iWindowWidth > 0) {
                                            iBfbWidth = (iWindowWidth / iPicMaxWidth).toFixed(2);
                                            var iRealityHeight = parseInt(aGlobalBannerHeight.m839986 * iBfbWidth) * 2;
                                            var iRealityWidth = iWindowWidth;
                                        }
                                        oBanner.height(iRealityHeight);
                                        oBanner.find('li').height(iRealityHeight);
                                        Banner.width(iRealityWidth);
                                        Banner.find('li').width(iRealityWidth);
                                    }
                                </script>
                                </div>
                            </td>
                            <td class="MoBodyR"></td>
                        </tr></tbody></table>

                        <table class="MoB"><tbody><tr>
                            <td class="MoBL"></td>
                            <td class="MoBM"></td>
                            <td class="MoBR"></td>
                        </tr></tbody></table>
                    </div>
                </div>
            </div>
            <div  visible="show" rel="r_layout_1" lock="lock" changes="0" id="row_8"  class="customModuleRow " >
                <div class="customModule  customModuleButgroup ">
                    <!--moCss-->
                    <div class="Mo " id="Mo_8" motype='17'>
                        <table class="MoT">
                            <tbody>
                            <tr>
                                <td class="MoTL"></td>
                                <td class="MoTM"></td>
                                <td class="MoTR"></td>
                            </tr>
                            </tbody>
                        </table>
                        <table class="MoHead"><tbody><tr>
                            <td class="MoHeadL"></td>
                            <td class="MoHeadM">
                                <table class="MoName">
                                    <tbody>
                                    <tr>
                                        <td class="MoNameL"></td>

                                        <td class="MoNameM">
                                            <strong class="NameTxt"> <a   href="#">111</a></strong>
                                        </td>
                                        <td class="MoNameR"></td>
                                    </tr>
                                    </tbody>
                                </table>
                                <span class="MoMore">
                                    <a   href="#">更多</a>
                                    </span>
                            </td>
                            <td class="MoHeadR"></td>
                        </tr>
                        </tbody>
                        </table>

                        <table class="MoBody"><tbody><tr>
                            <td class="MoBodyL"></td>
                            <td class="MoBodyM">
                                <div class="MoBodyC">

                                    <div class="butgroupModule"><ul class="butgroupList q">
                                        <li id="but_item_3359403" class="butItem  newBbutItem"><a   data-height="78" class="itemA" href="#"><span class=" imgicon  "   style="left: 0.24%; top:11.52%;"  data-picwidth="240" data-picheight="240" data-left="0.24"><img src="http://aimg8.dlszywz.com/wap/defineIcon/120_120/101/201701_587444be3f91c.png?t=9601#240#240" width="60" height="60"></span><span  style="left: 0.66%; top:35.81%;"  class="butText" data-left="0.66">黑名单查询</span></a></li>
                                        <li id="but_item_3359404" class="butItem  newBbutItem"><a   data-height="78" class="itemA" href="#"><span class=" imgicon  "   style="left: 0.25%; top:11.47%;"  data-picwidth="240" data-picheight="240" data-left="0.25"><img src="http://aimg8.dlszywz.com/wap/defineIcon/120_120/101/201701_587446a6d872f.png?t=6388#240#240" width="60" height="60"></span><span  style="left: 0.67%; top:35.79%;"  class="butText" data-left="0.67">人行征信查询</span></a></li>
                                        <%--<li id="but_item_3359405" class="butItem  newBbutItem"><a   data-height="78" class="itemA" href="#"><span class=" imgicon  "   style="left: 0.24%; top:10.24%;"  data-picwidth="240" data-picheight="240" data-left="0.24"><img src="http://aimg8.dlszywz.com/wap/defineIcon/120_120/101/201701_587446cee3b32.png?t=8629#240#240" width="60" height="60"></span><span  style="left: 0.67%; top:35.83%;"  class="butText" data-left="0.67">建议提案</span></a></li>--%>
                                        <%--<li id="but_item_3359427" class="butItem  newBbutItem"><a   data-height="78" class="itemA" href="#"><span class=" imgicon  "   style="left: 0.25%; top:10.26%;"  data-picwidth="240" data-picheight="240" data-left="0.25"><img src="http://aimg8.dlszywz.com/wap/defineIcon/120_120/101/201701_5874470f1323e.png?t=9138#240#240" width="60" height="60"></span><span  style="left: 0.67%; top:33.27%;"  class="butText" data-left="0.67">政务互动</span></a></li>--%>
                                        <li id="but_item_3359435" class="butItem  newBbutItem"><a   data-height="78" class="itemA" href="#"><span class=" imgicon  "   style="left: 0.24%; top:10.26%;"  data-picwidth="240" data-picheight="240" data-left="0.24"><img src="http://aimg8.dlszywz.com/wap/defineIcon/120_120/101/201701_587446edf30b5.png?t=777#240#240" width="60" height="60"></span><span  style="left: 0.67%; top:37.12%;"  class="butText" data-left="0.67">法律法规</span></a></li>
                                        <li id="but_item_3359436" class="butItem  newBbutItem"><a   data-height="78" class="itemA" href="#"><span class=" imgicon  "   style="left: 0.26%; top:10.21%;"  data-picwidth="240" data-picheight="240" data-left="0.26"><img src="http://aimg8.dlszywz.com/wap/defineIcon/120_120/101/201701_58744733aa036.png?t=4486#240#240" width="60" height="60"></span><span  style="left: 0.67%; top:33.23%;"  class="butText" data-left="0.67">留言板</span></a></li></ul></div>
                                </div>
                            </td>
                            <td class="MoBodyR"></td>
                        </tr></tbody></table>

                        <table class="MoB"><tbody><tr>
                            <td class="MoBL"></td>
                            <td class="MoBM"></td>
                            <td class="MoBR"></td>
                        </tr></tbody></table>
                    </div>
                </div>
            </div>
            <div  visible="show" rel="r_layout_1" lock="lock" changes="0" id="row_9"  class="customModuleRow " >
                <div class="customModule ">
                    <!--moCss-->
                    <div class="Mo Mo_1020" id="Mo_9" motype='4'>
                        <table class="MoT">
                            <tbody>
                            <tr>
                                <td class="MoTL"></td>
                                <td class="MoTM"></td>
                                <td class="MoTR"></td>
                            </tr>
                            </tbody>
                        </table>
                        <table class="MoHead"><tbody><tr>
                            <td class="MoHeadL"></td>
                            <td class="MoHeadM">
                                <table class="MoName">
                                    <tbody>
                                    <tr>
                                        <td class="MoNameL"></td>

                                        <td class="MoNameM">
                                            <strong class="NameTxt"> <a   href="#">公众号动态</a></strong>
                                        </td>
                                        <td class="MoNameR"></td>
                                    </tr>
                                    </tbody>
                                </table>
                                <span class="MoMore">
                                    <a   href="#">更多</a>
                                    </span>
                            </td>
                            <td class="MoHeadR"></td>
                        </tr>
                        </tbody>
                        </table>

                        <table class="MoBody"><tbody><tr>
                            <td class="MoBodyL"></td>
                            <td class="MoBodyM">
                                <div class="MoBodyC">

                                    <div class='autoH' style='overflow:hidden;'><div class='txtListmodule_2' id='text_listmodule_1734872'>
                                        <ul>					<li class="text_list_bk list_setup">
                                            <span class="txtlist-times textfont">2015-09-01</span>
                                            <span class="txtlist-a">
							<span class="listIcon">&nbsp;<em></em></span>
							<a  href="#" class="urlfont" title="菲扩军妄图南海对抗中国 结束十年没战斗机历史">
								菲扩军妄图南海对抗中国 结束十年没战斗机历史
							</a>
						</span>
                                        </li>					<li class="text_list_bk list_setup">
                                            <span class="txtlist-times textfont">2015-09-01</span>
                                            <span class="txtlist-a">
							<span class="listIcon">&nbsp;<em></em></span>
							<a  href="#" class="urlfont" title="军地联手依法查处一起造谣诋毁海军网络谣言">
								军地联手依法查处一起造谣诋毁海军网络谣言
							</a>
						</span>
                                        </li>					<li class="text_list_bk list_setup">
                                            <span class="txtlist-times textfont">2015-09-01</span>
                                            <span class="txtlist-a">
							<span class="listIcon">&nbsp;<em></em></span>
							<a  href="#" class="urlfont" title="八一飞行表演队三次飞出国门展空军开放自信">
								八一飞行表演队三次飞出国门展空军开放自信
							</a>
						</span>
                                        </li>					<li class="text_list_bk list_setup">
                                            <span class="txtlist-times textfont">2015-09-01</span>
                                            <span class="txtlist-a">
							<span class="listIcon">&nbsp;<em></em></span>
							<a  href="#" class="urlfont" title="联合国谴责驻马里维和部队遭袭事件">
								联合国谴责驻马里维和部队遭袭事件
							</a>
						</span>
                                        </li>					<li class="text_list_bk list_setup">
                                            <span class="txtlist-times textfont">2015-09-01</span>
                                            <span class="txtlist-a">
							<span class="listIcon">&nbsp;<em></em></span>
							<a  href="#" class="urlfont" title="俄称中国买S400没占便宜：打算买一套偷偷仿制">
								俄称中国买S400没占便宜：打算买一套偷偷仿制
							</a>
						</span>
                                        </li>					<li class="text_list_bk list_setup">
                                            <span class="txtlist-times textfont">2015-09-01</span>
                                            <span class="txtlist-a">
							<span class="listIcon">&nbsp;<em></em></span>
							<a  href="#" class="urlfont" title="双面谍李志豪将出狱 曾潜伏台“军情局”十多年">
								双面谍李志豪将出狱 曾潜伏台“军情局”十多年
							</a>
						</span>
                                        </li></ul></div></div>
                                </div>
                            </td>
                            <td class="MoBodyR"></td>
                        </tr></tbody></table>

                        <table class="MoB"><tbody><tr>
                            <td class="MoBL"></td>
                            <td class="MoBM"></td>
                            <td class="MoBR"></td>
                        </tr></tbody></table>
                    </div>
                </div>
            </div>

        </div>
    </div>
    <center></center>

    <div style="width:100%;line-height:45px;text-align:center;" class="ev_zhichi">
        <a  rel="nofollow" target="_blank" style="text-decoration:underline"></a>
    </div>

    <!--文章详细页不显示底部-->
    <div class="toolMenuBg" id="tool_menu_bg" ></div>
    <div class="toolMenu" id="tool_menu" >
        <menu class="toolBut q">
            <li id="toolHome" sorts="13" style=" width:20%;">
                <a id="index_link" href="lanrenmb/wap_doc/style4.html"  >
                    <b class="icon" id="icon_1252030">
                        <img src="images/wap/toolHome_icon.png" />
                    </b>
                    <!-- <b class="icon" id="icon_12520301">
                      <img src="/images/wap/toolHome_icon.png" />
                    </b> -->
                    <strong>首页</strong>
                </a>
            </li>
            <li id="toolTel" sorts="12" style=" width:20%;">
                <a  href="tel_3A"  >
                    <b class="icon" id="icon_1252027">
                        <img src="images/wap/toolTel_icon.png" />
                    </b>
                    <!-- <b class="icon" id="icon_12520271">
                      <img src="/images/wap/toolTel_icon.png" />
                    </b> -->
                    <strong>电话</strong>
                </a>
            </li>
            <li id="toolTelMessage" sorts="11" style="display: none; width:20%;">
                <a  href="sms_3A"  >
                    <b class="icon" id="icon_1252028">
                        <img src="images/wap/toolMessage_icon.png" />
                    </b>
                    <!-- <b class="icon" id="icon_12520281">
                      <img src="/images/wap/toolMessage_icon.png" />
                    </b> -->
                    <strong>信息</strong>
                </a>
            </li>
            <li id="toolQQ" sorts="10" style="display: none; width:20%;">
                <a  href="../wpa.qq.com/msgrd?v=3&uin=&site=qq&menu=yes"  >
                    <b class="icon" id="icon_1252034">
                        <img src="images/wap/toolQQ_icon.png" />
                    </b>
                    <strong>QQ</strong>
                </a>
            </li>
            <li id="tootMessage" sorts="9" style=" width:20%;">
                <a  href="wap/guest.html?username=zfhy8&channel_id=14674394"  >
                    <b class="icon" id="icon_1252032">
                        <img src="images/wap/toolGuestbook_icon.png" />
                    </b>
                    <strong>留言</strong>
                </a>
            </li>
            <li id="toolMap" sorts="8" style=" width:20%;">
                <a  href="wap/map.php?username=zfhy8"  >
                    <b class="icon" id="icon_1252029">
                        <img src="images/wap/toolMap_icon.png" />
                    </b>
                    <strong>位置</strong>
                </a>
            </li>
            <%--<li id="toolShoppingCar" sorts="7" style="display: none; width:20%;">--%>
                <%--<a  href="dom/sc_shopcar_add.php?username=zfhy8&wap=1"  >--%>
                    <%--<b class="icon" id="icon_1252033">--%>
                        <%--<img src="images/wap/toolShoppingCar_icon.png" />--%>
                    <%--</b>--%>
                    <%--<strong>购物</strong>--%>
                <%--</a>--%>
            <%--</li>--%>
            <li id="toolMember" sorts="6" style=" width:20%;">
                <a  href="dom/denglu.php?username=zfhy8&wap=1"  >
                    <b class="icon" id="icon_1252031">
                        <img src="images/wap/toolMember_icon.png" />
                    </b>
                    <strong>个人主页</strong>
                </a>
            </li>
            <%--<li id="tooltoolDistributionXiaoD" sorts="5" style="display: none; width:20%;">--%>
                <%--<a  href="wap/distribution_shop/check_distribution_status.php?username=zfhy8&wap=1"  >--%>
                    <%--<b class="icon" id="icon_2294427">--%>
                        <%--<img src="images/wap/tooltoolDistributionXiaoD.png" />--%>
                    <%--</b>--%>
                    <%--<!-- <b class="icon" id="icon_22944271">--%>
                      <%--<img src="/images/wap/tooltoolDistributionXiaoD.png" />--%>
                    <%--</b> -->--%>
                    <%--<strong>分销小店</strong>--%>
                <%--</a>--%>
            <%--</li>--%>
            <%--<li id="toolVoiceSearch" sorts="4" style="display: none; width:20%;">--%>
                <%--<a  href="wap/voicesearch.php?username=zfhy8&wap=1"   style = "display: none;" >--%>
                    <%--<b class="icon" id="icon_2294426">--%>
                        <%--<img src="images/wap/toolVoiceSearch.png" />--%>
                    <%--</b>--%>
                    <%--<!-- <b class="icon" id="icon_22944261">--%>
                      <%--<img src="/images/wap/toolVoiceSearch.png" />--%>
                    <%--</b> -->--%>
                    <%--<strong>语音</strong>--%>
                <%--</a>--%>
            <%--</li>--%>
            <%--<li id="toolProClass" sorts="3" style="display: none; width:20%;">--%>
                <%--<a  href="wap/proclass.php?username=zfhy8&wap=1"  >--%>
                    <%--<b class="icon" id="icon_2294425">--%>
                        <%--<img src="images/wap/toolProductClass.png" />--%>
                    <%--</b>--%>
                    <%--<!-- <b class="icon" id="icon_22944251">--%>
                      <%--<img src="/images/wap/toolProductClass.png" />--%>
                    <%--</b> -->--%>
                    <%--<strong>分类</strong>--%>
                <%--</a>--%>
            <%--</li>--%>
        </menu>
    </div>
    <span class="backTop" id="back_top"><em></em></span>
    <!--微名片详细页不显示导航-->
    <div class="fixedNavBut" id="fixed_nav_but" style="display:block;">
        <div class="navMoreBut_3">
            <i class="i-1"></i>
            <i class="i-2"></i>
            <i class="i-3"></i>
            <b class="b-1"></b>
            <b class="b-2"></b>
            <b class="b-3"></b>
        </div>
    </div>


    <div id="NMore" class="NMore_1002" state="close">
        <em class="NMTip"></em>
        <ul>
            <li >
                <a id="foot_index_link"  href="wap_zfhy8.html?showWelcome=1"><span>&#39318;&#39029;</span></a></li>
            <li ><a   href=""><span>公司新闻</span></a></li>
            <li ><a   href=""><span>公司产品</span></a></li>
            <li ><a   href=""><span>关于我们</span></a></li>
        </ul>
    </div>
    <div class="Nzz" id="Nzz"></div>
    <script type="text/javascript">
        $(function(){
            if (!$('.ev_t_top').length && !$('.ev_t_product_pj_tit').length) {
                $('#wxAndAppShowHtml').removeClass('content_margin');
            }
        });
        $(".baiduEditorTxtModule img").each(function(){
            var w = $(this).width();
            if(w > 320){
                $(this).css({'width':'100%','height':'auto'});
            }
        });
        //判断是否为微信
        function is_weixn(){
            var ua = navigator.userAgent.toLowerCase();
            if(ua.match(/MicroMessenger/i)=="micromessenger") {
                $('#wxAndAppShowHtml').show();
                return false;
            } else {
                $('#wxAndAppShowHtml').hide();
                return true;
            }
        }
        function GetQueryString(name)
        {
            var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
            var r   = window.location.search.substr(1).match(reg);
            if(r!=null){
                return  unescape(r[2]);
            }
            return '';
        }
        var is_weixn = is_weixn();
        if (is_weixn){
            writeCookie('openid','',168);
            var shareModule = $('#shareModule li');
            if (shareModule.length > 0 ){
                shareModule.find('.weixin').parent().remove();
            }
        }else {
            var openid = GetQueryString('openid');
            if (!readCookie('openid')){
                writeCookie('openid',openid);
            }
        }

    </script>
    <script language="javascript">
        var windowW = $(window).width(),windowH = $(window).height();
        $(window).resize(function(){
            setTimeout(function(){
                ButGroupLeftPosition();
            },500);
        })
        $(function(){
            ButGroupLeftPosition();
        });
        function ButGroupLeftPosition(states) {
            if($(".butgroupList").length){
                var winW = $(window).width();
                winW = winW < 640 ? winW : 640;
                $(".butgroupList").each(function(){
                    var Lthis_ = $(this),butItme = Lthis_.find(".newBbutItem");
                    butItme.each(function(){
                        var this_ = $(this),iLiWidth = this_.width(),aitem =this_.find("a.itemA");
                        iAHeight = parseInt(aitem.attr("data-height"));
                        var isReturn = false;
                        if(this_.find(".butText").length){
                            var iFont = this_.find(".butText");
                            iFont.css({'left':"0px"});
                            var iFontWidth = iFont.width();
                            var iFontLeftBfb = parseFloat(iFont.attr("data-left")).toFixed(4);
                            var iFontLeftPx=(iFontLeftBfb*iLiWidth)-(iFontWidth/2);
                            iFont.css({'left':iFontLeftPx+"px"});
                            isReturn = true;
                        }
                        //var time_img = setTimeout(function(){
                        //if(isReturn == true){
                        if(this_.find(".imgicon").length || this_.find(".ficon").length){
                            if(this_.find(".imgicon").length){
                                var iPic = this_.find(".imgicon"),
                                    iPic_sub = this_.find(".imgicon img");
                                var w = parseInt(iPic_sub.attr("width"));
                                if(w>iLiWidth){w=iLiWidth}
                            }else if(this_.find(".ficon").length){
                                var iPic = this_.find(".ficon");
                                //var w = iPic.width();
                                var w = iPic.attr('data-picwidth');
                            }
                            var iPicLeftBfb = parseFloat(iPic.attr("data-left")).toFixed(4);
                            var iPicLeftPx=(iPicLeftBfb*iLiWidth)-(w/2);
                            iPic.css({'left':iPicLeftPx+"px"});
                            //clearInterval(time_img);
                        }
                        //}
                        //},500);

                    });
                });
            }
        }

        uParse('.ev_t_product_xq_con', {
            rootPath: '../admin.ev123.com/ueditor/default.htm'
        });
        uParse('.ev_t_product_xq_new_div', {
            rootPath: '../admin.ev123.com/ueditor/default.htm'
        });
        uParse('.articleC', {
            rootPath: '../admin.ev123.com/ueditor/default.htm'
        });
        uParse('.baiduEditorTxtModule', {
            rootPath: '../admin.ev123.com/ueditor/default.htm'
        });
    </script>
</div>

<!--
-->


<script language="javascript">
</script>


<%--<div id="show_window" style="display:none;">--%>
    <%--<div class="bg_img"><span></span></div>--%>
    <%--<div class="fanli">--%>
        <%--<div class="close"><span id="close" style="cursor: pointer;">×</span></div>--%>
        <%--<div class="fanli_tit"><span id="p_name"><b>豫博大厦豫博大厦豫博大厦豫博大厦豫博大厦</b></span><p><img id="b_pic" src="images/show/logo.jpg"></p></div>--%>
        <%--<div class="fanli_con">--%>
            <%--<span>即将进入<font color="#ff3232" id="b_name">更多相关模板:微官网模板</font></span>--%>
            <%--<p><img src="images/show/fanli.jpg"></p>--%>
        <%--</div>--%>
        <%--<div class="fanli_a">--%>
            <%--<p class="fanli_p">1、您需要登陆或者注册一个<em id="p_name2">豫博大厦</em>网站账户收取返利和赠品、优惠</p>--%>
            <%--<p class="fanli_p">2、我们将在24小时内为您确认返利、赠品、优惠</p>--%>
        <%--</div>--%>
        <%--<div class="fanli_a">--%>
            <%--<a href="javascript:;" class="fanli_a2">我先逛逛</a>--%>
            <%--<a href="dom/denglu.php?username=zfhy8&wap=1" class="fanli_a1">立即登录</a>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
</div>
<script type="text/javascript">
    function show_window(userid){
        var url = "wap/CouponList/AjaxGetInfo.php";
        $.post(url,{username:"zfhy8",channel_id:"0",userid:userid,timestamp:ajaxInfo.timestamp},function(data){
            var result = eval('('+data+')');
            if(result!='fail'){
                $("#p_name b").text(result.platform_name);
                $("#p_name2").text(result.platform_name);
                $("#b_name").text(result.business_name);
                if(result.logopic){
                    $("#b_pic").attr('src',result.logopic);
                }else{
                    $("#b_pic").attr('src','images/fanli/logo.png');
                }
                $(".fanli_a2").attr('href',result.businessUrl);
                $(".fanli_a2").attr('target','_blank');
                $("#show_window").show();
                var Thight1 = $(document).scrollTop();
                var Whight1 = $(window).height();
                var divhight1 = $(".fanli").height();
                var maxhight1 = Thight1 + ((Whight1-divhight1-40)/2);
                $(".fanli").css("top",maxhight1);
            }
        });
    }

    $("#close").on('click',function(){
        $("#show_window").hide();
    });
    /*$(".fanli_a1").on('click',function(){
     $("#show_window").hide();
     $("#shopCarLogin").show();
     });*/
</script>
<script language="javascript">
    function definelinkFindShop(id) {
        if (!id) {
            return false;
        }

        $.ajax({
            'url' : "ajax.php",
            type: "POST",
            async: false,
            cache: false,
            dataType: "json",
            error : function() {
                alert('网络繁忙！');
            },
            data: {
                "type" : 2,
                "id" : id,
                "username" : "zfhy8",
                "wap" : 1,
                't' : UTCTimeDemo()
            },
            success: function(data) {
                if (data.success) {
                    if (data.target == 1) {
                        $("#show_window").show();
                        show_window(data.site_user_id);
                    } else {
                      //  window.open("wap/RedirectEngine.php?username=zfhy8&user_id="+data.site_user_id);
                    }
                } else {
                    alert("参数有误！");
                }
            }
        });
    }
</script>
</body>
</html>

</html>
