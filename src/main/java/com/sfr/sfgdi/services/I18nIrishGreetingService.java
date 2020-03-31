package com.sfr.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IRISH")
@Service("I18nService")
public class I18nIrishGreetingService implements GreetingService {
	@Override
	public String sayGreetings() {
		return "dia duit domhan - IRISH";
	}

}
