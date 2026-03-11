package com.example.spring_getting_started;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGettingStartedApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringGettingStartedApplication.class, args);

		Alien alien = context.getBean(Alien.class);
		alien.code();
	}

}
