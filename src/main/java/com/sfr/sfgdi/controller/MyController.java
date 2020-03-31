package com.sfr.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.sfr.sfgdi.services.GreetingService;

@Controller
public class MyController {

	/**
	 * @param greetingService
	 */
	//No need for @Autowired and @Qualifiers spring
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	private final GreetingService greetingService;
	
	public String Greet() {
		return this.greetingService.sayGreetings();
	}

}
