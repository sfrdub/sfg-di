/**
 * 
 */
package com.sfr.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.sfr.sfgdi.services.GreetingService;

/**
 * @author shaik
 *
 */
@Controller
public class PropertyInjectedController {

	/**
	 * 
	 */
	public PropertyInjectedController() {
		// TODO Auto-generated constructor stub
	}

	@Qualifier("propertyGreetingServiceImpl")
	@Autowired
	public GreetingService greetingService;
	
	public String Greet() {
		return greetingService.sayGreetings();
	}
	
}
