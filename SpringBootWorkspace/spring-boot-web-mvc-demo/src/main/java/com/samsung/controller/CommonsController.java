package com.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/commons")
public class CommonsController {
	
	/*
	 * http://loclahost:9090/commons/header
	 */
	@RequestMapping("/header")
	public String headerAction() {
		return "commons/header-segment";
	}

	/*
	 * http://loclahost:9090/commons/contactUs
	 */
	@RequestMapping(value="/contactUs",method=RequestMethod.GET)
	public ModelAndView contactUsAction() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("commons/contact-us-page");
		mv.addObject("mobile", "9247175823");
		mv.addObject("mail", "dachepallisrinivas@gmail.com");
		
		return mv;
	}
}
