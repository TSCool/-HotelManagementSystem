package hotel.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginview {
	@RequestMapping("login")
	public ModelAndView loginview(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mo = new ModelAndView();
		/*判断cookie是否缓存了内容*/
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
			mo.setViewName("main");
		}
		else {
			mo.setViewName("login");
		}
		return mo;
	}
}
