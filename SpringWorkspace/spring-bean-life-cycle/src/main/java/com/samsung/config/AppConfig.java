package com.samsung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.samsung.bean.DatabaseInitiaizer;

@Configuration

public class AppConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DatabaseInitiaizer databaseInitiaizer() {
		return new DatabaseInitiaizer();
	}
}
