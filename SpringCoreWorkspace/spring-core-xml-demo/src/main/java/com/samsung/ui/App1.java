package com.samsung.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samsung.service.MessageProcessor;
import com.samsung.service.MessageProcessorImpl;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		MessageProcessor obj = context.getBean("messageProcessor", MessageProcessorImpl.class);
		obj.processMsg("last date for payment of eleceticity bill is today : check your email account");

		context.close();
	}

}
