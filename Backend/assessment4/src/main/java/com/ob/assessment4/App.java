package com.ob.assessment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);


		Biryani biryani = context.getBean(Biryani.class);
		biryani.getBiryani();
		Idli idli = context.getBean(Idli.class);
		idli.getIdly();
		CocaCola cocacola = context.getBean(CocaCola.class);
		cocacola.getCocaCola();
		MilkShake milkshake = context.getBean(MilkShake.class);
		milkshake.getMilkShake();

	}
}
