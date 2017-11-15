package com.in28minutes.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.in28minutes.springboot.services.WelcomeService;

@RestController
public class WelcomeController {
	
	//this is like a dependency, hard coding and not easy to test
	//WelcomeService welcoemService = new WelcomeService();
	
	//Autowired is DI help to decouple and wire this bean at start up 
	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcomeMsg() {
		return welcomeService.returnWelcomeMsg();
	}
	
	@RequestMapping("/welcome2")
	public String welcomeMsg2() {
		return welcomeService.returnWelcomeMsg2();
	}
	
	@RequestMapping("/login")
	 public ModelAndView login() {
	 
	  String helloWorldMessage = "Hello world from java2blog!";
	  return new ModelAndView("login", "message", helloWorldMessage);
	 }

}

