package com.samsung.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.samsung.entity.Contact;
import com.samsung.exception.ContactBookException;
import com.samsung.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/")
	public ModelAndView homePageAction() throws ContactBookException {
		return new ModelAndView("home-page", "contactList", contactService.getAll());
	}
	
	@GetMapping("/addContact")
	public ModelAndView showContactFormAction() {
		return new ModelAndView("contact-form-page", "contact", new Contact());
	}
	
	@PostMapping("/addContact")
	public ModelAndView saveContactAction(@ModelAttribute("contact") @Valid Contact contact, BindingResult result) throws ContactBookException {
		ModelAndView mv = null;
		
		if (result.hasErrors()) {
			mv = new ModelAndView("contact-form-page", "contact", contact);
		} else {
			contactService.add(contact);
			mv = homePageAction();
		}
		return mv;
	}
	
	@GetMapping("/delContact")
	public String delContactAction(@RequestParam("cid") Long cid) throws ContactBookException {
		contactService.deleteById(cid);
		return "redirect:/";
	}
	
	@GetMapping("/editContact")
	public ModelAndView showContactForEditAction(@RequestParam("cid") Long cid) throws ContactBookException {
		ModelAndView mv = new ModelAndView("contact-form-page", "contact", contactService.getById(cid));
		mv.addObject("isEditing",true);
		return mv;
	}
	
	@PostMapping("/editContact")
	public ModelAndView editContactAction(@ModelAttribute("contact") @Valid Contact contact, BindingResult result) throws ContactBookException {
		ModelAndView mv = null;
		if (result.hasErrors()) {
			mv = new ModelAndView("contact-form-page", "contact", contact);
			mv.addObject("isEditing",true);
		} else {
			contactService.modify(contact);
			mv = homePageAction();
		}
		return mv;
	}
	
	
	
	
	
}
