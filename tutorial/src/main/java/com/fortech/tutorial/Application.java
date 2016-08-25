package com.fortech.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// No need for an external Tomcat 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
