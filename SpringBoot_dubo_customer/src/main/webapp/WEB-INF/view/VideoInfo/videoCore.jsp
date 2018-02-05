<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/mystyle.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
    <script src="<%=request.getContextPath() %>/js/videoInfo/hm.js"></script><script type="text/javascript" id="zhuge-js" async="" src="<%=request.getContextPath() %>/js/videoInfo/zhuge_002.js"></script><script type="text/javascript" async="" defer="defer" src="<%=request.getContextPath() %>/js/videoInfo/analytics.js"></script><script type="text/javascript">
    var _jsVersion = "1.0";
</script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/analytics_www_med66.js"></script> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="keywords" content="1707B研发六组">
    <meta name="description" content="1707B研发六组">
    <title>1707B免费试听课堂</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/videoInfo/style2017.css">
    <script type="text/javascript">
        var cwareSubjectTypeID = "42";
        var cwareSubjectMark = "linchuang";
        var cwareClassTypeID = null;
        var cwareName = null;
        function switchClassType(obj, ID, name) {
            $(obj).siblings().removeClass("on");
            $(obj).addClass("on");
            cwareClassTypeID = ID;
            loadList(null);
            try {
                if(name){
                    window.zhugeutil.classList(name);
                }
            } catch (e) { }
        }
        function switchCwareName() {
            var name = $.trim($("#cwareName").val());
            if (name == "课程名称、教师名称") {
                name = '';
            }
            cwareName = name;
            loadList(null);
        }
        function gotoPage(currentpage) {
            loadList(currentpage);
        }
        function loadList(currentpage) {
            $.ajax({
                type: 'post',
                url: '/xcware/demo/ajaxList.shtm',
                data: {cwareSubjectMark: cwareSubjectMark, cwareClassTypeID: cwareClassTypeID,
                    cwareName: encodeURI(cwareName), currentpage: currentpage},
                success: function(html) {
                    $("#ajaxListHtml").html(html);
                    scrollTo(0, 0);
                }
            });
        }
    </script>
    <script type="text/javascript">
        function browserRedirect() {
            var sUserAgent = navigator.userAgent.toLowerCase();
            var bIsIphoneOs = sUserAgent.match(/iphone/i) == "iphone";
            var bIsPad = sUserAgent.match(/pad/i) == "pad";
            var bIsMidp = sUserAgent.match(/midp/i) == "midp";
            var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
            var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
            var bIsAndroid = sUserAgent.match(/android/i) == "android";
            var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
            var bIsBBOS = sUserAgent.match(/blackberry/i) == "blackberry";
            var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
            if (bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM || bIsBBOS|| bIsPad) {
                window.location.href = getPlayUrl();
            }
        };
        function getPlayUrl() {
            var currentUrl = window.location.href;
            var changedUrl = "http://"+currentUrl.replace("http://www.med66.com","m.med66.com");
            return changedUrl;
        }
        browserRedirect();
    </script>
    <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="demoListApp" src="<%=request.getContextPath() %>/js/videoInfo/demoListApp.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="jquery" src="<%=request.getContextPath() %>/js/videoInfo/jquery-1.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="analysis/zhuge.util" src="<%=request.getContextPath() %>/js/videoInfo/zhuge.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="demo/demoList" src="<%=request.getContextPath() %>/js/videoInfo/demoList.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="common/controller" src="<%=request.getContextPath() %>/js/videoInfo/controller.js"></script></head>

<body>
<script src="<%=request.getContextPath() %>/js/videoInfo/head_champion_new.js" language="javascript"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/videoInfo/dialog.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/videoInfo/head2017.css">
<div class="header layout msf">
    <a href="http://www.med66.com/" target="_blank" class="logo fl" title="1707B研发六组医学教育网"><img src="<%=request.getContextPath() %>/js/videoInfo/logo.png" alt="1707B研发六组医学教育网"></a>
    <h2 id="titlesName">
        <a target="_self" href="http://www.med66.com/webhtml/demo/" title="免费试听" style="text-decoration: none;float: left;line-height: 70px;font-size: 24px;padding: 0 0 0 22px;font-weight: normal;">免费试听</a>
    </h2>
    <div class="right fr">
        <div class="right-login fl" id="noLogin">
            <a href="javascript:void(0)" class="dzhan fl" onclick="loginRegister(1);return false;" title="学员登录">登录</a>
            <a href="javascript:void(0)" class="dzhan fl" onclick="loginRegister(2);return false;" title="学员注册">注册</a>
        </div>
        <div class="right-loginh fl pr h-an qp" id="yesLogin" style="display: none">
            <span class="ctxt">
                <i class="xquan abs"></i>
                <img src="<%=request.getContextPath() %>/js/videoInfo/h_00.jpg" alt="">
            </span>
            <i class="xian abs"></i>
            <div class="pop3 clearfix abs">
                <div class="pop3-t clearfix">
                    <div class="pop3-t-l fl" id="loginIconUrl">
                        <a href="http://member.med66.com/mycenter/myInfo/wdzl.shtm" target="_blank">
                            <i class="dquan abs"></i>
                            <img src="<%=request.getContextPath() %>/js/videoInfo/default.jpg">
                        </a>
                    </div>
                    <div class="pop3-t-r fl">
                        <p id="loginName"></p>
                    </div>
                </div>
                <div class="pop3-c clearfix">
                    <a href="http://member.med66.com/mycenter/index.shtm" target="_blank" class="chan fl h-an" title="">我的课程</a>
                    <a href="http://member.med66.com/mycenter/myInfo/wdzl.shtm" target="_blank" class="chan chan2 fl h-an" title="">个人资料</a>
                </div>
                <a href="javascript:void(0)" class="pop3-b" onclick="newlogout()" title="退出">退 出</a>
            </div>
        </div>
    </div>
    <div class="cen fr">
        <div class="cen-n01 fl pr h-an qp" style="txte">
            <span class="ctxt" style="padding-left: 27px;">手机版</span>
            <div class="pop2 clearfix abs" style="display: none;">
                <div class="pop2-t"><img style="width:80px;height:80px" src="<%=request.getContextPath() %>/js/videoInfo/medMobile.png" alt=""></div>
                <p class="pop2-b">医学教育网</p>
            </div>
        </div>
        <div class="cen-n01 fl pr h-an qp" style="txte">
            <span class="ctxt" style="padding-left: 35px;">微信</span>
            <div class="pop2 clearfix abs" style="display: none;">
                <div class="pop2-t"><img style="width:80px;height:80px" src="<%=request.getContextPath() %>/js/videoInfo/medWechat.jpg" alt=""></div>
                <p class="pop2-b">医学教育网</p>
            </div>
        </div>
        <div class="cen-n01 fl pr h-an qp">
            <span class="ctxt">APP下载</span>
            <div class="pop2 clearfix abs" style="display: none;">
                <div class="pop2-t"><img style="width:80px;height:80px" src="<%=request.getContextPath() %>/js/videoInfo/emw.png" alt=""></div>
                <p class="pop2-b">医学教育网</p>
            </div>
        </div>
    </div>
</div><div class="bghui2">
    <div class="listtit clearfix layout msf">
        <div class="left fl">临床执业医师</div>
        <ul class="cen fl">
            <li class="on" onclick="switchClassType(this, 0);">全部<i class="an"></i></li>
            <li onclick="switchClassType(this, '115', '基础学习班');">
                基础学习班<i class="an"></i>
            </li>
            <li onclick="switchClassType(this, '116', '习题精讲班');">
                习题精讲班<i class="an"></i>
            </li>
            <li onclick="switchClassType(this, '117', '应试技巧班');">
                应试技巧班<i class="an"></i>
            </li>
            <li onclick="switchClassType(this, '118', '实践技能');">
                实践技能<i class="an"></i>
            </li>
        </ul>
        <div class="ss fr">
            <input id="cwareName" value="课程名称、教师名称" onfocus="this.value='';this.style.color='#323133'" onblur="if(!value){value=defaultValue;this.style.color=''}" class="ss-l fl msf" type="text">
            <span class="ss-r fr an" onclick="switchCwareName();">查找</span>
        </div>
    </div>
    <div id="ajaxListHtml" class="list clearfix layout msf"><script type="text/javascript">
        var _jsVersion = "1.0";
    </script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/analytics_www_med66.js"></script>
        <div id="videoDiv" class="main clearfix">

            <div class="stnr fl">
                <a onclick="window.demoList.zhuge('临床执业医师','2017临床执业医师','临床执业-预防医学（2017）','童　潇')" href="http://www.med66.com/demo/linchuang/c705970/" target="_blank" class="pic pr">
                    <i class="jt abs an"></i><img src="<%=request.getContextPath() %>/js/videoInfo/201612261452208102.jpg" width="224" height="142">
                </a>
                <div class="txt">
                    <p class="txt-t" style="text-overflow: ellipsis;white-space: nowrap;overflow: hidden;">
                        <a onclick="window.demoList.zhuge('临床执业医师','2017临床执业医师','临床执业-预防医学（2017）','童　潇')" href="http://www.med66.com/demo/linchuang/c705970/" target="_blank">临床执业-预防医学（2017）-基础学习班</a>
                    </p>
                    <p class="txt-b">
                        <a href="http://www.med66.com/laoshi/weisheng/tx.shtml" target="_blank" class="fl">童　潇</a>
                        <span class="fr">已有<em>6042</em>人学习过</span>
                    </p>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $(function () {
                alert(123);
                $.ajax({
                    url:'<%=request.getContextPath() %>/VideoInfoContoller/findVideoList.do',
                    type:'post',
                    dataType:'json',
                    success:function(data){

                        var data=data.rows;
                        //   video_id, video_saveid, video_type, video_name, video_Imgid, video_cost, video_info,
                        //    video_click, video_userId, video_status, video_score, check_status, video_addtime,
                        //    videoinnerTypeid, videostrTypeid, video_time, video_orderFlag
                        alert("取得数据++++"+data);
                        var divHtml = "";
                        for (var i = 0; i < data.length; i++) {
                              alert("这是图片的id"+data[i].video_Imgid);
                            divHtml += '<div class="stnr fl">' +
                                '                <a onclick="window.demoList.zhuge(\''+data[i].video_addtime+'\'年度-'+data[i].video_name+'\',作者-'+data[i].user_count+'\')" href="<%=request.getContextPath() %>/VideoInfoContoller/queryImg.do?videoId='+data[i].video_id+'">' +
                                '                    <i class="jt abs an"></i><img src="<%=request.getContextPath() %>/upload/queryImg.do?imgid='+data[i].video_Imgid+'" width="224" height="142">' +
                                '                </a>' +
                                '                <div class="txt">' +
                                '                    <p class="txt-t" style="text-overflow: ellipsis;white-space: nowrap;overflow: hidden;">' +
                                '                        <a onclick="window.demoList.zhuge(\''+data[i].video_addtime+'\'年度-'+data[i].video_name+'\',作者-'+data[i].user_count+'\')" href="http://www.med66.com/demo/linchuang/c705970/" target="_blank">'+data[i].video_addtime+'年度-基础学习</a>' +
                                '                    </p>' +
                                '                    <p class="txt-b">' +
                                '                        <a href="http://www.med66.com/laoshi/weisheng/tx.shtml" target="_blank" class="fl">'+data[i].user_count+'</a>' +
                                '                        <span class="fr">已有<em>'+data[i].video_click+'</em>人学习过</span>' +
                                '                    </p>' +
                                '                </div>' +
                                '            </div>';
                            
                        }
                        alert(divHtml);

                        $("#videoDiv").append(divHtml);
                    },

                    error:function(){
                        alert("查询视频错误！");
                    }
                })
            })
        </script>
        <script type="text/javascript">
            var _jsVersion = "1.0";
        </script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/analytics_www_med66.js"></script> <div class="fy clearfix">
            <a href="javascript:void(0);" onclick="gotoPage(1);" class="sxy">上一页</a>
            <a href="javascript:void(0);" onclick="gotoPage(1);" class="ys on">1</a>
            <a href="javascript:void(0);" onclick="gotoPage(2);" class="ys ">2</a>
            <a href="javascript:void(0);" onclick="gotoPage(2);" class="sxy">下一页</a>
        </div></div>
</div>



    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title></title>
    <style>
    /* CSS Document */
    body{font:12px/1.5 "\5b8b\4f53",arial,Helvetica,Tahoma,sans-serif; margin:0 auto; color:#333;}
    p,ul,ol,dl,dt,dd,h1,h2,h3,h4,h5,h6,form,input,select,button,textarea,iframe{margin:0; padding:0;}
    img{border:0 none;}
    ul,li,ol{list-style-type:none;}
    i,em,address, caption, cite, code, dfn, th, var {font-style: normal;font-weight: normal}
    .msf{font-family:\5FAE\8F6F\96C5\9ED1,\9ED1\4F53;}
    a{text-decoration:none;color:#333;}
    a:hover{text-decoration:underline;}
    a,a:hover{outline:none;blur:expression(this.onFocus=this.blur());}
    .layout{ clear:both;width:1000px;text-align:left;margin:0 auto;}
    .clearfix:after{content:".";display:block;height:0;clear: both;visibility:hidden;}
    .clearfix{*zoom:1;}
    .fl{ float:left;_display: inline}
    .fr{ float:right;_display: inline}
    .pr{ position:relative}
    .abs{position:absolute;}
    .footer{ line-height: 32px; font-size: 12px; font-family:\5FAE\8F6F\96C5\9ED1,\9ED1\4F53; text-align: center; color: #666; margin: 10px auto;}
    .footer a{ color: #a8beb9;}
    .footer .fontfam{ font-family: Verdana,Arial,Helvetica,sans-serif;}
</style>



<div class="footer">
    Copyright <font class="fontfam">©</font> 2005 - 2018 www.med66.com All Rights Reserved.　北京东大正保科技有限公司 版权所有<br>
    <a href="#" id="footsetur" target="_blank" title="将1707B研发六组医学教育网设为首页">设为首页</a>－<a href="http://www.med66.com/webhtml/about.shtml" target="_blank" title="1707B研发六组医学教育网网站相关介绍">关于我们</a>－<a href="http://www.med66.com/webhtml/ceo.shtml" target="_blank" title="正保远程教育董事长风采">董事长风采</a>－<a href="http://www.med66.com/webhtml/hezuo.shtml" target="_blank" title="医学教育网欢迎合作">欢迎合作</a>－<a href="http://www.med66.com/jiucuo/?address=http://www.med66.com/webhtml/demo/" target="_blank" id="jiucuo" title="医学教育网我要纠错">我要纠错</a>－<a href="http://www.med66.com/webhtml/chengpin.shtml" target="_blank" title="医学教育网_诚聘英才">招聘信息</a>－<a href="http://www.med66.com/help/" target="_blank" title="医学教育网帮助中心">帮助中心</a>－<a href="http://www.med66.com/sitemap.shtml" target="_blank" title="医学教育网网站地图">网站地图</a><br>
    24小时咨询电话：010-82311666 / <font title="手机、座机均可拨打400电话，仅收取市话费">4006501888</font>　传真：010-82330766　投诉电话：010-82330110　建议邮箱：<a title="1707B研发六组医学教育网建议邮箱账号" href="mailto:jy@med66.com">jy@med66.com</a>　客服邮箱：<a href="mailto:med66@med66.com">med66@med66.com</a><br>
    <a href="#" target="_blank" title="1707B研发六组医学教育网互联网信息服务：京ICP证030467号">京ICP证030467号</a>　<a href="http://www.hd315.gov.cn/beian/view.asp?bianhao=010202007022800611" target="_blank">工商局红盾315备案号：010202007022800611</a>　　<a href="http://www.med66.com/licence/cbw.htm" target="_blank" rel="external nofollow" title="1707B研发六组医学教育网出版物经营许可证：京批字第直0579号">出版物经营许可证</a>　<img src="<%=request.getContextPath() %>/js/videoInfo/li040387.png" style="display:inline-block; vertical-align: middle; width: 20px; height: 20px;" width="20" height="20" border="0"><a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010802020153" target="_blank" title="医学教育网京公网安备11010802020153">京公网安备11010802020153</a>　<a href="http://www.med66.com/licence/zhizhao.htm" target="_blank" title="医学教育网营业执照">营业执照</a>
</div>
<script language="javascript" src="<%=request.getContextPath() %>/js/videoInfo/judgeBrowers.js"></script>
<script>
    //获取当前页面来源地址并作为参数传给纠错页面
    var srcUrl = document.referrer;
    var jcUrl = document.getElementById("jiucuo").href;
    document.getElementById("jiucuo").href=jcUrl+"?address="+srcUrl;
</script>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "//hm.baidu.com/hm.js?072191e710028974c49838d068b2a510";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })(); </script>
<!-- 监控广告投放 -->
<script language="javascript" src="<%=request.getContextPath() %>/js/videoInfo/poster.js"></script>
<script src="<%=request.getContextPath() %>/js/videoInfo/visit.js" language="javascript"></script>
<script type="text/javascript">
    if(typeof jQuery == 'undefined'){
        document.write("<script src=\"//www.med66.com/js/jquery-1.9.1.min.js\">"+"</scr"+"ipt>");
    };
</script><script src="<%=request.getContextPath() %>/js/videoInfo/jquery-1_002.js"></script>
<script language="javascript" src="<%=request.getContextPath() %>/js/videoInfo/uuid.js"></script>






<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/videoInfo/style2017.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/jquery-1_002.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/head2017.js"></script><script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/loginDialog.js"></script>

<script type="text/javascript">
    var currentUrl = window.location.href;
    if (currentUrl.indexOf("/xcware") >= 0) {
        var url = "http://www.med66.com/webhtml/demo/"+"linchuang"+".shtml";
        window.location.href = url;
    }
    var pageData = {};
    pageData.basePath = "/xcware";
    pageData.statPath = "/cwresources";
    pageData.jsVersion = "v13";
</script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/videoInfo/config.js"></script>
<script src="<%=request.getContextPath() %>/js/videoInfo/require.js" data-main="/xcware/cwresources/js/main/demoListApp">
</script>

</body></html>