package hotel.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hotel.entity.Custom;
import hotel.entity.Home;
import hotel.serviceimp.CustomMapperimp;
import hotel.serviceimp.HomeMapperimp;

@Controller
public class ingeneral {
	@RequestMapping("ingeneral.do")
	public ModelAndView ingeneraldo(HttpServletRequest req, HttpServletResponse resp) {
			ModelAndView mo = new ModelAndView();
			//添加客人基本信息
			String name = req.getParameter("name");
			String phone = req.getParameter("phone");
			String sex = req.getParameter("sex");
			String address = req.getParameter("address");
			String idcard = req.getParameter("idcard");
			Custom cus = new Custom(name,phone,sex,address,idcard);
			CustomMapperimp custom = new CustomMapperimp();
			custom.insertone(cus);
			//添加客户房间信息
			String homenums = req.getParameter("homenum");
			Integer homenum = Integer.parseInt(homenums);
			String type = req.getParameter("tppe");
			String money = req.getParameter("money");
			String come = req.getParameter("come");
			String go = req.getParameter("go");
			Home home = new Home(homenum,type,money,come,go);
			HomeMapperimp ho = new HomeMapperimp();
			ho.insertone(home);
			//同时入住记录增加
			List<Custom> customselect = custom.selectall();
			req.getSession().setAttribute("custom", customselect);
			mo.setViewName("center");
		return mo;
	}
}
