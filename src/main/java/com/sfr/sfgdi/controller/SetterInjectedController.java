package com.sfr.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.sfr.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	public SetterInjectedController() {
		// TODO Auto-generated constructor stub
	}
	
	@Qualifier("setterGreetingServiceImpl")
	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String Greet() {
		return greetingService.sayGreetings();
	}

}
