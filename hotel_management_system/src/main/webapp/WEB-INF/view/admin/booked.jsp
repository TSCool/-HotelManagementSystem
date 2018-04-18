<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/adminstyle/content.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public.css" />
	</head>
	<body>
		<div class="content_all">
			<div id="bookedtop" class="flexbet">
				<div>
					账户编号
					<select>
						<option value="11">001</option>
					</select>
				</div>
				<div>
					账户类型
					<select>
						<option value="11">001</option>
					</select>
				</div>
			</div>
			<div id="bookedcennter" class="flexbet">
				<div>
					<div>订单编号<input type="text"/></div>
				    <div>预订的类别<input type="text"/></div>
				    <div>预定天数<input type="text" /></div>
				    <div>入住开始时间<input type="text" /></div>
				</div>
				<div>
					<div>预定的房间号<input type="text" /></div>
					<div>入住人数<input type="text" /></div>
					<div>入住结束时间<input type="text" /></div>
				</div>
			</div>
			<div id="bookedbot">
				<div>
					预定时间<input type="text" />
				        联系人<input type="text" />
				</div>
				<div id="booked_commit">
					<button>取消</button>
					<button>提交预订</button>
				</div>
			</div>
		</div>
	</body>
</html>
