package hotel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class admin_main_view{
	
	@RequestMapping("*.view")
	public ModelAndView mainview(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mo = new ModelAndView();
		//获取路径，然后截取
		String path = req.getRequestURI();
		String pathname = path.substring(path.lastIndexOf("/") + 1);
		if(pathname.equals("top.view")) {
			mo.setViewName("top");
		}
		/*else if(pathname.equals("left.view")) {
			mo.setViewName("left");
		}
		else if(pathname.equals("center.view")) {
			mo.setViewName("center");
		}
		else if(pathname.equals("right.view")) {
			mo.setViewName("right");
		}*/
		return mo;
	}
}
