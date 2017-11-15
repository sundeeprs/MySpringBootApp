package com.in28minutes.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.springboot")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = SpringApplication.run(Application.class, args);

	}

}
