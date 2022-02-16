package com.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	//@ResponseBody
	@RequestMapping("/hello")
	public String helloAction() {
		return "hello";				//     /WEB-INF/view/hello.jsp
	}

}
