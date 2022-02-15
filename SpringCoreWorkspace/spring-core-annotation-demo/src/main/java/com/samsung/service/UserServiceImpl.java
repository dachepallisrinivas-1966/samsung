package com.samsung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService{

	
	//@Autowired
	private MessageService messageService;
	
	/*@Autowired
	public UserServiceImpl(MessageService messageService) {
		super();
		this.messageService = messageService;
	}*/

	@Autowired
	@Qualifier("SMSService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
