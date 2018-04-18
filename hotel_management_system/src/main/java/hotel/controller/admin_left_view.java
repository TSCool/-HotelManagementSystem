package hotel.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class admin_left_view {
	
	@RequestMapping("*.left")
	public ModelAndView leftview(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mo = new ModelAndView();
		String path = req.getRequestURI();
		String pathname = path.substring(path.lastIndexOf("/") + 1);
		if(pathname.equals("ingeneral.left")) {
			mo.setViewName("ingeneral");
		}
		else if(pathname.equals("booked.left")) {
			mo.setViewName("booked");
		}
		else if(pathname.equals("record.left")) {
			mo.setViewName("record");
		}
		else if(pathname.equals("center.left")) {
			mo.setViewName("center");
		}
		return mo;
	}
}
