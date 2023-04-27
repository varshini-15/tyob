package com.ob.assessment5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
	public class ChildConfig {
		@Bean
		   public Child getChild() {
		      Child child = new Child();
		      child.setName("Ramya");
		      child.setAge(10);
		      child.setGender("Female");
		      child.setStandard(7);
		      child.setHobbies(Arrays.asList("Cleaning","Reading", "Drawing"));
		      child.setSubjectsStudying(new HashSet<String>(Arrays.asList("Tamil", "Maths", "English")));
		      child.setFriendsAndGender(new HashMap<String, String>() {{
		         put("Ram", "male");
		         put("Agalya", "female");
		         put("Srimathi", "female");
		      }});
		      child.setPet(getDog()); 	
		     
		      return child;
		   }
		   
		   @Bean
		   public Dog getDog() {
		      return new Dog();
		   }
		   @Bean
		   public Fish getFish() {
		      return new Fish();
		   }
		   
		  
}
