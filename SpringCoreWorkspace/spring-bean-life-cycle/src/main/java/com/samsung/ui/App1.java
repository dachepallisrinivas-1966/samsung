package com.samsung.ui;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samsung.config.AppConfig;

public class App1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();
	}
}