package com.samsung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.samsung.service.MessageProcessor;
import com.samsung.service.MessageProcessorImpl;
import com.samsung.service.MessageService;
import com.samsung.service.TwitterService;


@Configuration
public class AppConfiguration2 {
	
	@Bean(name="twitterService")
	public MessageService twitterService(){
		return new TwitterService();
	}
		
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(twitterService());
	}
}
