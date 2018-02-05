<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/common/mystyle.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>三级目录</title>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/style2.css" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/style.js" ></script>
</head>
<body>
	<div id="dbnav">
	<div class="dbnav_context">
		<p class="dbnav_context_left">
			<img src="http://img.bjguahao.gov.cn/ws/1.0/hs/images/dbnav.png">
			<span>010-888/666888电话咨询</span>
		</p>
		<p class="dbnav_context_right" id="isLogin">	
			欢迎来到XXXXXXX 请
			<a id="bdtj1" class="db_denglu" href="javascript:void(0);" onclick="tologin('#djdl','#djdl_close');" >
				登录
			</a>
			<a id="bdtj4" class="db_denglu" href="javascript:void(0);" style="display: none">
			</a>
			<a id="bdtj3" class="db_denglu" href="#" onclick="tologout()" style="display: none">
				注销
			</a>
			<a id="bdtj2" target="_blank" href="">注册</a>
		</p>
		
	</div>
	</div>
	<%-- <div>
		<img style="height: 120px;width: 150px" src="<%=request.getContextPath() %>/img/logo.jpg">
		
	</div> --%>
	<div class="containor">
		
	<div class="nav_left"  id="onelevel" >
		<!-- <ul>
			<li data-id="1"> <span>美妆/个人护理</span></li>
			<li data-id="2"> <span>手机 /数码 /电脑办公</span></li>
			<li data-id="3"> <span>零食 /茶酒 /进口食品 </span></li>
		</ul> -->
	</div>
	<div class='nav_right' id="twolevel" >
		
	</div>
</div>
<script type="text/javascript">
	//注销
	function tologout(){
		$.ajax({
			url:"<%=request.getContextPath()%>/loginuser/tologout.do",
			type:"post",
			success:function(data){
				$("#bdtj2").show();
				$("#bdtj1").show();
				$("#bdtj4").hide();
				$("#bdtj3").hide();
				
			},
			error:function(){
				alert("注销失败");
			}
		})
	}
	//展示昵称
  $(function(){
	  $.ajax({
			url:"<%=request.getContextPath()%>/loginuser/loginAccount.do",
			type:"post",
			dataType:"json",
			success:function(data){
				//alert(data.userNiki);
				$("#bdtj2").hide();
				$("#bdtj1").hide();
				$("#bdtj4").text(data.userNiki);
				$("#bdtj4").show();
				$("#bdtj3").show();
			},
			error:function(){
				alert("失败");
			}
			
		})
	  
	 
	 
  })
	//登录
	function getJspHtml(urlStr){
		 var  jspHtml = "";
	//	 async  (默认: true) 默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false。
	//注意，同步请求将锁住浏览器，用户其它操作必须等待请求完成才可以执行。
			$.ajax({
				url:urlStr,
				type:'post',
				//同步的ajax
				async:false,
				success:function(data){
					//alert(data);//data--addProduct.jsp页面内容
					jspHtml = data;
				},
				error:function(){
					bootbox.alert("ajax失败");
				}
			});
		return jspHtml;
	}
	
	function  dialog(HTMLurl,submitUrl){
		 var dialog = bootbox.dialog({ 
			message: getJspHtml(HTMLurl)   //调用方法  
			/* buttons:{
							"save":{
							  label: '登录',
							  //自定义样式
							  className: "btn-success",
							  callback: function() {
									$.ajax({
										url:submitUrl,
										type:'post',
										data:$("[name='loginForm']").serialize(),
										success:function(data){
												//bootbox.alert("上传成功");
											location.href=location;
										},
										error:function(){
											bootbox.alert("ajax失败");
										}
									});
							  }
							},
							"unSave":{
								  label: '取消',
								  //自定义样式
								 className: "btn-info",
								  callback: function() {
									  location.href=location;
									 // return false;  //dialog不关闭
								  }
								}
						} */
	});
	}
	//登录
	function tologin(){
		//alert(123);
		dialog("<%=request.getContextPath()%>/userweb/tologin.do","<%=request.getContextPath()%>/userweb/userWebLogin.do");
	}
	
	
	//三级目录
	$(function (){
		$.ajax({
			url:"<%=request.getContextPath()%>/three/queryOne.do",
			type:"post",
			dataType:"json",
			success:function(data){
				var oneHtml = '<ul>';
				for (var i = 0; i < data.length; i++) {
					oneHtml +='<li onmouseover="queryTwo('+data[i].id+')"  data-id='+data[i].id+'> <h4 align="left"><span>'+data[i].name+'</span></h4></li>'
				}
				oneHtml +='</ul>';
				$("#onelevel").html(oneHtml);
			},
			error:function(){
				alert("失败");
			}
			
		})
	})
	
	function queryThree(twoid){
		var threelevel = "";
		//alert(twoid)
		$.ajax({
			url:"<%=request.getContextPath()%>/three/queryThree.do",
			async:false,
			type:"post",
			data:{'ids':twoid},
			dataType:"json",
			success:function(data){
				threelevel= '<dd>';
				for (var i = 0; i < data.length; i++) {
					threelevel+='<a>'+data[i].name+'</a>';
				}
				threelevel +='</dd>';
			},
			error:function(){
				alert("三级目录失败");
			}
		})
		//alert(threelevel);
		return threelevel;
	}
	
	
	
	
	function queryTwo(id){
		//alert(id)
		$.ajax({
			url:"<%=request.getContextPath()%>/three/queryTwo.do",
			type:"post",
			data:{'ids':id},
			dataType:"json",
			async:false,
			success:function(data){
				//alert(data)
				var twoHtml="<div class='sub hide'  data-id='"+id+"' style='width: 1600px;height: 800px'>"+
								'<dl>';
				for (var i = 0; i < data.length; i++) {
					var twoid = data[i].id;
					
					twoHtml +='<dt><a >'+data[i].name+' <i> &gt;</i></a> </dt>';
								
					twoHtml+=queryThree(twoid);
						
				}
				twoHtml+='</dl>'+
							'</div>';
				$('#twolevel').html(twoHtml);
			},
			error:function(){
				alert("二级目录失败");
			}
			
		})
	}
	

   
</script>
</body>
</html>