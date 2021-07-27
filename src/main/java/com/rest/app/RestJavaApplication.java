package com.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.rest.app.controller"})
public class RestJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestJavaApplication.class, args);
	}

}
