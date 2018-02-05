document.domain = "med66.com";
var _domain = "http://member.med66.com";
setTimeout(getSsoUrl, 1000);
var dialogLoginReg={
	config:{
		type:'1',	//1,页面跳转；2.调用方法
		gotoURL:'',	//type为1时，对应的结果url
		callback:'dialogLoginReg.test'	//type为2时，对应的结果function
	},
	donext:function(){
		eval(dialogLoginReg.config.callback+"()");
	},
	test:function(){alert("这是个测试");}
}
function innit(loginId,registerId){
	$("#"+loginId).click(function(){loginRegister(1);});
	$("#"+registerId).click(function(){loginRegister(2);});
}
function loginRegister(index){
	var contentStr = "";
	var height = "";
	var width = "";
	var type = dialogLoginReg.config.type;
	var goUrl = dialogLoginReg.config.gotoURL;
	if(index == 2){
		height = "550";
		width = "450";
		contentStr = "iframe:" + _domain + "/uc/member/register.shtm?gotoUrl="+goUrl+"&type="+type;
	}else{
		height = "550";
		width = "450";
		contentStr = "iframe:" + _domain + "/uc/member/login.shtm?gotoUrl="+goUrl+"&type="+type;
	}
	dialogShow(contentStr,width,height,"from","210");
}
var dialogFirst=true;
function dialogShow(content,width,height,cssName,topSpace,showbg,offsets,obj){
if(dialogFirst==true){
  var temp_float=new String;
  temp_float="<div id=\"floatBoxBgm\" style=\"height:"+$(document).height()+"px;filter:alpha(opacity=0);opacity:0;\"></div>";
  temp_float+="<div id=\"floatBox\" >";
  temp_float+="<div class=\"contents\"></div>";
  temp_float+="</div>";
  $("body").append(temp_float);
  dialogFirst=false;
}
contentType=content.substring(0,content.indexOf(":"));
content=content.substring(content.indexOf(":")+1,content.length);
var cStr="<iframe id='frame1' src=\""+content+"\" width=\"450px\" height=\""+(parseInt(height))+"px"+"\" scrolling=\"no\" allowtransparency=\"true\" frameborder=\"0\" marginheight=\"0\" marginwidth=\"0\"></iframe>";
$("#floatBox .contents").html(cStr);

if(navigator.userAgent.indexOf("TencentTraveler")>0){
	$("#frame1").attr("src",content);
}
if(showbg != false){
	$("#floatBoxBgm").show();
	$("#floatBoxBgm").animate({opacity:"0.3"},"normal");
}
$("#floatBox").attr("class","floatBox "+cssName);
if(offsets == null && obj == null){
	$("#floatBox").css({display:"block",left:(($(document).width())/2-(parseInt(width)/2))+"px",top:($(document).scrollTop()-(height=="auto"?300:parseInt(height)))+"px",width:(parseInt(width)+2)+"px",height:height,border:"none",background:"none"});
	$("#floatBox").animate({top:($(document).scrollTop()+$(window).height()/2-parseInt(topSpace))+"px"},"normal");
}
}
function closeWin(){
	$("#floatBoxBgm").remove();
	$("#floatBox").remove();
	$("select").attr("disabled","");
	dialogFirst=true;
}
function chgW(){
	document.getElementById("floatBox").style.width="920px";
	document.getElementById("floatBox").style.height="500px";
	document.getElementById("frame1").style.height="500px";
	document.getElementById("frame1").style.width="920px";
	var width = document.getElementById("floatBox").style.width;
	$("#floatBox").css({left:(($(document).width())/2-(parseInt(width)/2))+"px"});
}
function onloadW(){
	window.location.reload();
}
function switchWindow(index){
	closeWin();
	loginRegister(index);
}
function getSsoUrl() {
	$.ajax({
		type : "GET",
		url : _domain + "/member/loginOrReg/dispose/getSsoLogin.shtm",
		dataType : "jsonp",
		jsonp : "jsonpCallback",
		success : function(json) {
			if (json.code == "0") {
				//onloadW();
				$(".yesLogin").hide();
				var flag;
				$.getJSON("http://member.med66.com/member/verifyLogin.shtm?jsonpCallback=?",
				function(json){ 
					flag = json.flag;
					if(flag == "true") {
						$(".noLogin").hide();
						$(".yesLogin").show();
						$(".loginname").html("欢迎您：" + json.nickName);
					}
				});
			}
		},
		error : function(data) {
		}
	});
}
function lmRegister(uid,onloadW) {
	$.ajax({
		type : "get",
		async : false,
		url : "http://union.chinaacc.com/union/register/register.shtm?uid="+uid,
		dataType : "jsonp",
		jsonp : "jsonpCallback",
		jsonpCallback : "flightHandler",
		success : function(data) {
			onloadW();
		},
		error : function() {	}
	});
}

$(function(){
	$(".yesLogin").hide();
	var flag;
	$.getJSON("http://member.med66.com/member/verifyLogin.shtm?jsonpCallback=?",
	function(json){ 
		flag = json.flag;
		if(flag == "true") {
			$(".noLogin").hide();
			$(".yesLogin").show();
			$(".loginname").html("欢迎您：" + json.nickName);
		}
	});	
});
//登出 
function logout(){
	var url = window.location.href;
	window.location.href="http://member.med66.com/member/logout.shtm?gotoURL="+url;
};