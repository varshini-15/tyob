package com.ob.assessment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DrinksConfig {
	 @Bean 
	   public CocaCola cocacola(){
	      return new CocaCola();
	   }

	   @Bean 
	   public MilkShake milkshake(){
	      return new MilkShake();
	   }
}
