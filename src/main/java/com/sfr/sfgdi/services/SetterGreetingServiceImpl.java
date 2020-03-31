/**
 * 
 */
package com.sfr.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author shaik
 *
 */
@Service
public class SetterGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello World -- Setter";
	}

}
