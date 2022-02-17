package com.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samsung.model.BookModel;

@Controller
@RequestMapping("/book")
public class BookController {

	// @RequestMapping(value="",method=RequestMethod.GET)
//	@GetMapping
//	public String bookFormAction() {
//		return "book/book-form-page";
//	}

	@GetMapping
	public ModelAndView bookFormAction() {
		return new ModelAndView("book/book-form-page","book",new BookModel());
	}
	
	// @RequestMapping(value="",method=RequestMethod.POST)
	@PostMapping
	public ModelAndView bookAction(@ModelAttribute BookModel book) {
		return new ModelAndView("book/book-page","book",book);
	}
}
