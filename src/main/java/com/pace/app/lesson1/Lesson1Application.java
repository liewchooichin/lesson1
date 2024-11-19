package com.pace.app.lesson1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson1Application {

	// logging
	private static final Logger logger = LoggerFactory.getLogger(Lesson1Application.class); 

	public static void main(String[] args) {
		// logger.info("🟢 Starting MySpringbootProjectApplication");
		// logger.warn("🟠 Test Warning");
		// logger.error("🔴 Error Warning");
		SpringApplication.run(Lesson1Application.class, args);
		System.out.println("My first spring boot app. Hello Spring Boot.");
	}

}
