package com.samsung.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

	@RequestMapping("/header")
	public ModelAndView headerAction() {
		return new ModelAndView("header-page", "webApptitle", "ContactBook");
	}
	
	@RequestMapping("/footer")
	public ModelAndView footerAction() {
		return new ModelAndView("footer-page", "year", LocalDate.now().getYear());
	}
}
