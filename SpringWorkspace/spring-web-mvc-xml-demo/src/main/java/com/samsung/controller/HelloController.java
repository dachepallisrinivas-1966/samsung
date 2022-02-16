package com.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//@ResponseBody
	@RequestMapping("/hello")
	public String helloAction() {
		return "hello";				//     /WEB-INF/view/hello.jsp
	}
	
	@RequestMapping(value = "/age", method=RequestMethod.GET)
	public ModelAndView welcomeAction() {
		return new ModelAndView("hello", "myAge", "54");		//	/WEB-INF/view/welcome.jsp
	}

}
