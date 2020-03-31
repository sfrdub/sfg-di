package com.sfr.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sfr.sfgdi.services.GreetingService;
import com.sfr.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

	private SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		
		controller.setGreetingService(new GreetingServiceImpl());
		
	}

	@Test
	void testGreet() {
		assertEquals(controller.Greet() == "Hello World", true);
	}
}
