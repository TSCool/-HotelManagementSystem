<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<frameset rows="20%,70%" border="no">
		<frame src="${pageContext.request.contextPath}/admin/top.view" name="top" scrolling="no" />
		<frameset cols="15%,54%,29%">
			<frame src="left.html" name="left"/>
			<frame src="center.html" name="center" scrolling="no" />
			<frame src="right.html" name="right" scrolling="no" />
		</frameset>
	</frameset>
</html>
