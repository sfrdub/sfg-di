package com.sfr.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sfr.sfgdi.services.GreetingServiceImpl;

class ContructorInjectedControllerTest {

	private ContructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ContructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void testGreet() {
		assertEquals(controller.Greet() == "Hello World", true);
	}
}
