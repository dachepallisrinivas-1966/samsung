package com.samsung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.samsung.service.EmailService;
import com.samsung.service.MessageService;
import com.samsung.service.SMSService;


@Configuration
@ComponentScan("com.samsung")
@Import(AppConfiguration2.class)
public class AppConfiguration {

	@Bean(name="emailService")
	public MessageService emailService(){
		return new EmailService();
	}
	
	@Bean(name="smsService")
	public MessageService smsService(){
		return new SMSService();
	}
	
}
