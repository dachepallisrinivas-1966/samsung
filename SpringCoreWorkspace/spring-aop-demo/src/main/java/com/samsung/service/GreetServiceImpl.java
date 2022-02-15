package com.samsung.service;
import org.springframework.stereotype.Service;

@Service("gs")
public class GreetServiceImpl implements GreetService {

	@Override
	public String greet(String userName) {
		return String.format("%s %s", "Hello ",userName);
	}

}