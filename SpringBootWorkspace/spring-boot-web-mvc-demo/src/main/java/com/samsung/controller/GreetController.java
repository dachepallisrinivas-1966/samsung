package com.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class GreetController {

	/*
	 * http://localhost:8081/greet
	 */
	@RequestMapping(value="",method=RequestMethod.GET)
	public String greetAction() {
		return "greet/greet-page";
	}
	
	/*
	 * http://localhost:8081/greet
	 */
	@RequestMapping(value="",method=RequestMethod.POST)
	public ModelAndView doGreetAction(@RequestParam("unm") String userName) {
		return new ModelAndView("greet/greet-page","msg","Hello " + userName);
	}
}
