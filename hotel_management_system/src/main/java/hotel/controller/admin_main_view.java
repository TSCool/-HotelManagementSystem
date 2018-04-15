package hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class admin_main_view{
	
	@RequestMapping("test")
	public String mainview() {
		return "1321";
	}
}
