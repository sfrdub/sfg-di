/**
 * 
 */
package com.sfr.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sfr.sfgdi.services.GreetingServiceImpl;

/**
 * @author shaik
 *
 */
class PropertyInjectedControllerTest {

	private PropertyInjectedController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new GreetingServiceImpl();
	}

	/**
	 * Test method for {@link com.sfr.sfgdi.controller.PropertyInjectedController#Greet()}.
	 */
	@Test
	void testGreet() {
		assertEquals(controller.Greet() == "Hello World", true);
	}

}
