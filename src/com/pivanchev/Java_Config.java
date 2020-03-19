package com.pivanchev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Java_Config {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Example.class);
		
		Example example = context.getBean(Example.class);
		example.setMessage("Java configuration.");
		example.getMessage();
		
		((ConfigurableApplicationContext)context).close();
		
		

	}

}
