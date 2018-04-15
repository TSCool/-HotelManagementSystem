<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../css/adminstyle/index.css"/>
		<link rel="stylesheet" type="text/css" href="../css/public.css"/>
		<script type="text/javascript" src="../../js/jquery-3.3.1.min.js" ></script>
		<script type="text/javascript" src="../../js/admin/index.js" ></script>
	</head>
	<body>
		<!--底部左侧内容-->
				<div id="botleft">
					<div class="main_drop flexaro">
						<div>入住管理</div>
						<div name="drop">一</div>
					</div>
					<div class="drop_down" name="drop_content">
						<li><a href="ingeneral.html" target="center">普通入住</a></li>
						<li><a href="booked.html" target="center">预定入住</a></li>
						<li><a href="member.html">会员入住</a></li>
						<li><a href="defriend,html">拉黑提醒</a></li>
					</div>
					<div class="main_drop flexaro">
						<div>信息查询</div>
						<div name="drop">一</div>
					</div>
					<div class="drop_down hidden" name="drop_content">
						<li>客户信息</li>
						<li><a href="record.html" target="center">入住记录</a></li>
						<li>客户预定</li>
					</div>
					<div class="main_drop flexaro">
						<div>客户管理</div>
						<div name="drop">一</div>
					</div>
					<div class="drop_down hidden" name="drop_content">
						<li>登录查询</li>
						<li>入住登记</li>
						<li>房间预定</li>
						<li>申请退房</li>
						<li>查询空房</li>
					</div>
					<div class="main_drop flexaro">
						<div>楼层管理</div>
						<div name="drop">一</div>
					</div>
					<div class="drop_down hidden" name="drop_content">
						<li>登录查询</li>
						<li>入住登记</li>
						<li>房间预定</li>
						<li>申请退房</li>
						<li>查询空房</li>
					</div>
					<div class="main_drop flexaro">
						<div>后台设置</div>
						<div name="drop">一</div>
					</div>
					<div class="drop_down hidden" name="drop_content">
						<li>登录查询</li>
						<li>入住登记</li>
						<li>房间预定</li>
						<li>申请退房</li>
						<li>查询空房</li>
					</div>
					<div id="count">
						<div class="flexaro resimg">
							<div>
								<img id="result" src="../../img/icon/result.png" />
							</div>
							<div>
								<h2>营业额统计</h2>
							</div>
						</div>
						<table>
							<tr>
								<td>今日收入:</td>
								<td>8300元</td>
							</tr>
							<tr>
								<td>本周收入:</td>
								<td>8300元</td>
							</tr>
							<tr>
								<td>本月收入:</td>
								<td>12100元</td>
							</tr>
							<tr>
								<td>历史收入:</td>
								<td>47200元</td>
							</tr>
						</table>
					</div>
				</div>
				<!--底部左侧内容结束-->
	</body>
</html>