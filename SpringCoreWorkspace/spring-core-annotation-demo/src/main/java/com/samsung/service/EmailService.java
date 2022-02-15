package com.samsung.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
