package com.sfr.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService {
	@Override
	public String sayGreetings() {
		return "Hellow World - EN";
	}

}
