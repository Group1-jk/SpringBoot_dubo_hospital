<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/style2.css" />
 <%@ include file="/common/mystyle.jsp" %>
<script type="text/javascript">
	function rapidlogin(){
		/* var a = $("ul li:first").index();
		alert(a);
		
		$(this).addClass("djdl_selected").siblings().removeClass("djdl_selected");
		  var b = a.index(this);
		  $("#djdl_tab_id form").eq(b).show().siblings().hide() */
		
		$("#rg_nrfrom1").show();
		$("#rg_nrfrom2")[0].reset();
		$("#rg_nrfrom2").hide(); 
		
	}
	
	function Loginauthentication(){
		/* /* var a = $("ul li:first").index();
		alert(a);
		$(this).addClass("djdl_selected").siblings().removeClass("djdl_selected");
		  var b = a.index(this);
		  $("#djdl_tab_id form").eq(b).show().siblings().hide() */
		  
		$("#rg_nrfrom2").show(); 
		$("#rg_nrfrom1")[0].reset();
		$("#rg_nrfrom1").hide();
		
		
		
	}

</script>
</head>

<body>
 
	<div class="djdl_tab">
		<div class="djdl_menu" id="djdl_menui">
			<ul>
				<li class="" onclick="rapidlogin()">快速登录</li>
				<li class="djdl_selected" onclick="Loginauthentication()">验证登录</li>
			</ul>
		</div>
		<div id="djdl_tab_id" class="djdl_tab_box">
			<form name="loginForm" id="rg_nrfrom1" method="post">
																
				<div class="ysdl_tsyj"><p>温馨提示：为了保证您的信息安全,请认真填写。</p></div>
				<div class="ksdl_ul">
					<div class="vre_err"><span id="qresultspan"></span></div>
					<dl class="djdl_ty_dl">
						<dt>账号:</dt>
						<dd>
							<input name="userAccount" id="mobileQuickLogin" class="register_input" maxlength="18" 
							onfocus="javascript:if(this.value=='已注册账号')this.value='',style.color='#000'; $('.hl_tsxx_yc').show()" onblur="javascript:if(this.value=='')this.value='已注册账号',style.color='#ccc';" style="color: #ccc;" type="text"/>
							<b class="tipinfo">*</b>
						</dd>
					</dl>
					<dl class="djdl_ty_dl">
						<dt>密码:</dt>
						<dd>
							<input name="userPass" autocomplete="off" style="display:none" id="pw" type="password"/>
							<input id="pwQuickLogin" name="userPass" autocomplete="off" class="register_input" maxlength="18" type="passWord">
							<b class="tipinfo">*</b>
							<b class="tipinfo"></b>
						</dd>
					</dl>
					
					<div class="tydiv">
						<center>
						<div class="btn-group">
							<button id="queryRedio" type="button" class="btn btn-info" onclick="login()">
						    	登录
						    </button>
					    </div>&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="btn-group">
							<button id="queryRedio" type="button" class="btn btn-info">
						    	注册新用户
						    </button>
					    </div>
					    </center>
 					</div>
 					
				</div>
			</form>
			
			<form name="loginForm" id="rg_nrfrom2" method="post" class="djdl_hide">
				<div class="ysdl_ul">
 					<div class="ysdl_tsyj"><p>温馨提示：请使用手机号验证登录。</p></div>
 					<div class="vre_err"><span id="vresultspan"></span></div>
 					<dl class="djdl_ty_dl"><dt>用户姓名：</dt><dd>
 					<input id="nameVerifyLogin" name="userName" class="register_input" value="请填写已注册用户真实姓名" onfocus="javascript:if(this.value=='请填写已注册用户真实姓名')this.value='',style.color='#000';" onblur="javascript:if(this.value=='')this.value='请填写已注册用户真实姓名',style.color='#ccc';" style="color:#ccc" type="text"><b class="tipinfo">*</b></dd></dl>
 					<dl class="djdl_ty_dl"><dt>手机号码：</dt><dd>
 					<input id="mobileVerifyLogin" name="sms" class="register_input" maxlength="18" value="与姓名绑定的手机号码" onfocus="javascript:if(this.value=='与姓名绑定的手机号码')this.value='',style.color='#000'; $('.hl_tsxx_yc').show()" onblur="javascript:if(this.value=='')this.value='与姓名绑定的手机号码',style.color='#ccc';" style="color: #ccc;" type="text"><b class="tipinfo">*</b></dd></dl>
 					<dl class="djdl_ty_dl"><dt>手机验证码：</dt><dd><input id="sjyzmVerifyLogin" name="smsCode" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" maxlength="6" class="register_inputa" type="text">
 					<input id="btnSendCodeVLogin" name="yt0" class="msjyz_dj" value="获取验证码" type="button"><b class="tipinfo">*</b></dd></dl>
 					</div>
 					
 				<div class="tydiv">
						<center>
						<div class="btn-group">
							<button id="queryRedio" type="button" class="btn btn-info" onclick="login()">
						    	登录
						    </button>
					    </div>&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="btn-group">
							<button id="queryRedio" type="button" class="btn btn-info">
						    	注册新用户
						    </button>
					    </div>
					    </center>
 					</div>
 			
 			</form>
 		</div>
 		</div>
 		<div id="djdl_close"><a></a>
 		</div>
	
<script type="text/javascript">

	function login(){
		$.ajax({
			url:"<%=request.getContextPath()%>/loginuser/loginUser.do",
			type:"post",
			data:$("[name='loginForm']").serialize(),
			dataType:"json",
			success:function(data){
				//alert(data);
				if(data==2){
					location.href="<%=request.getContextPath()%>/threeIndex.jsp";
				}else if(data==1){
					alert("请输入正确的密码。");
				}else if(data==0){
					alert("请输入正确的账号信息!");
				}
			},
			error:function(){
								
				alert("登录失败!!!");
			}
			
		})
		
		
		
	}



	
</script>	
</body>
</html>