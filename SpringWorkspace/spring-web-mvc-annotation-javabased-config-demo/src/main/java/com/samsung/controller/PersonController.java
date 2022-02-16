package com.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samsung.model.Person;


@Controller
public class PersonController {

	@RequestMapping("/hello")
	public String helloAction(Model model) {
	
		Person person = new Person();
		person.setName("srinivas");
		person.setEmailId("dachepallisrinivas@gmail.com");
		person.setAge(55);
		model.addAttribute("person", person);
		return "hello";
	}
}