package com.samsung.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.samsung.config.AppConfiguration;
import com.samsung.service.UserService;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		UserService  userService = context.getBean(UserService.class);
		userService.processMsg("sms message sending ");

	}

}
