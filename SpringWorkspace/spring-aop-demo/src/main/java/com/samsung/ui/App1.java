package com.samsung.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

import com.samsung.service.GreetService;

@Configuration
@ComponentScan("com.samsung")
@EnableAspectJAutoProxy
public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App1.class);

		GreetService gs = (GreetService) context.getBean("gs");
		System.out.println(gs.greet("Srinivas"));
		
		context.close();

	}

}