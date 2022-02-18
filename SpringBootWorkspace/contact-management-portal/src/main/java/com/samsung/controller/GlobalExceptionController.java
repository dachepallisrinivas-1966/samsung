package com.samsung.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.samsung.exception.ContactBookException;

@ControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(ContactBookException.class)
	public ModelAndView handleContactBookException(ContactBookException excep) {
		return new ModelAndView("error-page", "errMsg", excep.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception excep) {
		return new ModelAndView("error-page", "errMsg", excep.getMessage());
	}
	
}
