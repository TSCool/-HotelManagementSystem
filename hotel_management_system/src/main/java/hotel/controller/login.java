package hotel.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hotel.entity.Admin;
import hotel.serviceimp.AdminMapperimp;
import hotel.util.session;

@Controller
public class login {
	@RequestMapping("logindo")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mo = new ModelAndView();
		//获取用户输入信息
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		AdminMapperimp adminselect = new AdminMapperimp();
		//获取查询的数据
		List<Admin> list = adminselect.selectall();
		//判断用户输入信息是否正确
		for(int i = 0; i<list.size();i++) {
				if(username.equals(list.get(i).getUsername()) && password.equals(list.get(i).getPassword())) {
					//输入用户名密码正确，将信息存入session
					req.getSession().setAttribute("username", username);
					req.getSession().setAttribute("password", password);
					//存入cookie一天
					Cookie cookie = new Cookie("username", username);
					cookie.setMaxAge(100000);
					resp.addCookie(cookie);
					Cookie cookie2 = new Cookie("password",password);
					cookie2.setMaxAge(100000);
					resp.addCookie(cookie2);
					mo.setViewName("main");
				}
				else {
					mo.setViewName("login");
				}
		}
		return mo;
	}
}
