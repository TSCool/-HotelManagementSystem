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
			<form action="ingeneral.do" method="post">
				<div id="general_top">房间520的旅客信息，接待对象:普通人员</div>
				<div id="general_top_content" class="flexaro width">
					<div class="general_content_left">
						<div>
							<select name="homenum">
								<option value="132">520</option>
								<option value="132">110</option>
							</select>
							<p>房 &nbsp间 &nbsp号</p>
						</div>
						<div>
							<select>
								<option value="132">全日租</option>
								<option value="132">钟点房</option>
							</select>
							<p>出租方式</p>
						</div>
						<div>
							<select>
								<option value="132">过内旅客</option>
								<option value="132">国外旅客</option>
								<option value="132">中 &nbsp学 &nbsp生</option>
							</select>
							<p>旅客类别</p>
						</div>
						<div>
							<input type="text" value="1">
							<p>人数</p>
						</div>
						<div>
							<input type="text" name="type"/>
							<p>房间类型</p>
						</div>
					</div>
					<div class="general_content_left">
						<div>
							<input type="date" name="come" value="2018.3.28">
							登记时间
						</div>
						<div>
							<input type="text" name="money" value="180.00￥">
							标准房价
						</div>
						<div>
							<input type="text" value="180.00￥">
							优惠房价
						</div>
						<div>
							<input type="date" name="go" value="2018.3.29">
							预计离店
						</div>
						<div>
							<select>
								<option value="132">现金支票</option>
								<option value="132">微信支付</option>
							</select>
							结账方式
						</div>
					</div>
					<div id="general_content_right">
						<div>
							<button>确认</button>
						</div>
						<div>
							<button>帮助</button>
						</div>
						<div>
							<button>结账方式	</button>
						</div>
						<div>
							<button>取消</button>
						</div>
					</div>
				</div>
				<div id="general_center" class="flexaro width">
					<li>国内旅客</li>
					<li>电弧服务</li>
					<li>押金记录</li>
					<li>客历查询</li>
					<li>读取证件信息</li>
					<li></li>
				</div>
				<div id="general_bot" class="flexaro width">
					<div id="general_botleft">
						<div id="general_botlefttop">流水号：4359 &nbsp房间号:520 &nbsp接待对象：普通人员</div>
						<div class="flexaro">
							<div id="general_botleft_content">
								<div><input name = "name" type="text"><p>姓名</p></div>
								 <div><input name="sex" type="text" />性别</div>
								 <div><input type="text" />民族</div>
								 <div><input name = "year" type="date" />出生日期</div>
								 <div><input name="address" type="text" />地址</div>
								 <div><input name="idcard" type="text" />身份证号码</div>
								 <div><input name = "phone" type="text" />联系方式</div>
								 <div><input type="text" />证件有效日期</div>
							</div>
							<div>
								<img src="${pageContext.request.contextPath}/static/image/headimg/headimg.jpg" />
							</div>
						</div>
					</div>
					<div id="general_botright">
						<div><p>二代身份证阅读器设置</p></div>
						<div id="general_botright_content_all" class="flexaro">
							<div id="general_botright_content">
							<div>
								连接方式
								<select>
									<option value="Usb连接">Usb连接</option>
								</select>
							</div>
							<div>
								串口号
								<input type="text"/>
							</div>
							<div>
								usb口
								<input type="text"/>
							</div>
						</div>
						</div>
						<div>
							<p><button>读身份证</button><button>复制资料</button>
							<input type= "submit" value="提交"/>
							</button2></p>
						</div>
					</div>
				</div>
			</form>
		</div>
	</body>

</html>