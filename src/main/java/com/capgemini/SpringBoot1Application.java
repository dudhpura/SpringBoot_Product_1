package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/*
 * public class SpringBoot1Application {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(SpringBoot1Application.class, args); }
 */
public class SpringBoot1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBoot1Application.class);
		
	}
}
