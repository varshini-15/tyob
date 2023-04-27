package com.ob.beanspring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.ob.spring.car.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
    	BeanLife beanLife = context.getBean(BeanLife.class);
    	context.close();
    }
}
