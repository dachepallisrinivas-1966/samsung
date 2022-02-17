package com.samsung.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	/* dynamic menu generation */
	@ModelAttribute
	public void populateCommonData(Model model) {
		Map<String, String> navLinks = new LinkedHashMap<>();
		
		navLinks.put("home", "Home");
		navLinks.put("emps", "Employees");
		navLinks.put("newEmp", "New Employee");
		navLinks.put("searchEmp", "Search Employee");
		
		model.addAttribute("links", navLinks);
		model.addAttribute("appTitle", "Employee Management System");
	}
	
	@GetMapping(path={"","/","/home"})
	public ModelAndView homeAction(
			@RequestParam(name="msgCode", required=false, defaultValue="0") int msgCode,
			@RequestParam(name="id", required=false, defaultValue="0") long empId
			) {
		ModelAndView mv = new ModelAndView("dash-board");
		if (msgCode > 0) {
			mv.addObject("msg", "Employee #" + empId + " is "
					+ (msgCode == EmployeeController.SAVED ? "Saved" : "Deleted")
					+ " successfully"
					);
		}
		return mv;
	}
	
	@GetMapping(path="/header")
	public ModelAndView headerAction() {
		return new ModelAndView("header");
	}
	
	@GetMapping(path="/footer") 
	public ModelAndView footerAction() {
		return new ModelAndView("footer");
	}
	
	
}
