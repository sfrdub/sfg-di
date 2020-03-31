/**
 * 
 */
package com.sfr.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author shaik
 *
 */
@Primary //Uses over @Qualifier
@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello World -- From the PRIMARY bean";
	}

}
