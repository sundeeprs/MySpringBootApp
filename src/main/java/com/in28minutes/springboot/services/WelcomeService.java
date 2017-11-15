package com.in28minutes.springboot.services;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String returnWelcomeMsg() {
		// TODO Auto-generated method stub
		return "Hare Krishna Hare Krishna"+"\n"
				+ "Krishan Krishan Hare hare"+"\n"
				+ "Hare Ram Hare Ram Ram Hare hare... Sprint Boot learning";
	}
	
	
	public String returnWelcomeMsg2() {
		// TODO Auto-generated method stub
		return "This is second message from Sprint Boot app Hare krishna";
	}
	
	
}
