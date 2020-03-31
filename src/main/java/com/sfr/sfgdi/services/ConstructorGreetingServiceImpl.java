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
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello World -- Constructor";
	}

}
