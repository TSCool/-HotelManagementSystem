<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/adminstyle/main.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js" ></script>
	</head>
	<script>
	//设置高度为屏幕高度
		window.onload=function(){
			var h = $(document).height();
			$("#contain").height(h);
		}
	</script>
	<body>
		<div id="contain" style="background-image: url(${pageContext.request.contextPath}/static/image/adminimg/head.jpg)" class="flexaro">
			<div id="content">
				<div id="logintop">
					<h1>艾特酒店管理系统</h1>
					<h4>Hotell Ett management system</h4>
				</div>
				<div id="loginbot">
					<form action="logindo" method="post">
						<h3>后台登录</h3>
						<input type="text" name="username" placeholder="请输入用户名" />
						<input type="text" name="password" placeholder="请输入密码"/><br>
						<input type="submit" id="lg" value="登录" />
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
