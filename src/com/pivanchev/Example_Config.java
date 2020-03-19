package com.pivanchev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example_Config {
	
	@Bean
	public Example example() {
		return new Example();
	}

}
