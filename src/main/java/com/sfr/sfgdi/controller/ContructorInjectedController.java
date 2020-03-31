package com.sfr.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.sfr.sfgdi.services.GreetingService;

@Controller
public class ContructorInjectedController {

	private final GreetingService greetingService;

	public ContructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String Greet() {
		return greetingService.sayGreetings();
	}
}
