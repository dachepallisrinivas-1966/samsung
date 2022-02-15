package com.samsung.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.samsung.config.AppConfiguration;
import com.samsung.service.MessageProcessor;

public class App1 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageProcessor  userService = context.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
		context.close();
	}
}
