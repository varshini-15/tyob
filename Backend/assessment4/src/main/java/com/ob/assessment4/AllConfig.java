package com.ob.assessment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FoodConfig.class,DrinksConfig.class})
public class AllConfig {
   @Bean
   public FoodConfig foodconfig() {
      return new FoodConfig(); 
   }
   @Bean
   public DrinksConfig drinksconfig() {
      return new DrinksConfig(); 
   }
}