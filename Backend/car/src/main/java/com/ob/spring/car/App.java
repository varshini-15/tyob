package com.ob.spring.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
    	Car car = context.getBean(Car.class);
    	car.start();
//    	Car car = new Car();
//    	car.start();
//    	
    }
}

//<property name="engine" ref="engine1">
//<!--1st way -name as class name ref as bean name  -->
//</property>
//
//<!--2nd way  -->
//<constructor-arg ref = "engine1"></constructor-arg
//<bean id="engine1" class="com.ob.spring.car.Engine" />
//<bean id = "car" class="com.ob.spring.car.Car">
//
//</bean>
