//设置高度为屏幕高度
window.onload = function() {
	var h = $(document).height();
	$("#contain").height(h);
}
//后台下拉菜单
$(document).ready(function() {
	$("[name=drop]").each(function() {
		var this_div = $("[name=drop_content]");
		var _inx = $("[name=drop]").index(this);
		$(this).click(function() {
			this_div.eq(_inx).slideToggle();
		}, function() {
			this_div.eq(_inx).slideToggle();
		});
	});
});