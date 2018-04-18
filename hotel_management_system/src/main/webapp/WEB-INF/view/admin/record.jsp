<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/adminstyle/content.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/public.css" />
</head>
<body>
	<div class="content_all">
		<table id="record">
			<tr>
				<td>姓名</td>
				<td>联系方式</td>
				<td>身份证号</td>
				<td>性别</td>
				<td>住址</td>
				<!-- <td>房间号</td>
					<td>房间类型</td>
					<td>所付金额</td>
					<td>入住时间</td> -->
			</tr>
			<c:forEach items="${sessionScope.custom}," var="user">
				<tr>
					<td>${user.name}</td>
					<td>${user.phone}</td>
					<td>${user.idcard}</td>
					<td>${user.sex}</td>
					<td>${user.address}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
