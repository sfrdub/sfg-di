package com.sfr.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sfr.sfgdi.controller.ContructorInjectedController;
import com.sfr.sfgdi.controller.MyController;
import com.sfr.sfgdi.controller.PropertyInjectedController;
import com.sfr.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController mycontroller = (MyController) ctx.getBean("myController");
		
		System.out.println("====Property controller====");
		System.out.println(mycontroller.Greet());
		
		System.out.println("====Property controller====");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.Greet());
		
		System.out.println("====Setter controller====");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.Greet());
		
		System.out.println("====Constructor controller====");
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.Greet());
	}

}
