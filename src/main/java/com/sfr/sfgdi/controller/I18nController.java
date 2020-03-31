package com.sfr.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.sfr.sfgdi.services.GreetingService;

@Controller
public class I18nController {

	private final GreetingService greetingService;
	
	/**
	 * @param greetingService
	 */
	public I18nController(@Qualifier("I18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String Greet() {
		return this.greetingService.sayGreetings();
	}

}
