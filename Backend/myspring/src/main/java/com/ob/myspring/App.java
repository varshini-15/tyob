package com.ob.myspring;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ob.myspring1.pen.InkPen;
import com.ob.myspring1.pen.Pen;


public class App 
{
    public static void main( String[] args )
    {
//    	InkPen inkPen = new InkPen();
//    	inkPen.write();
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
    	
		Pen pen =  applicationContext.getBean(Pen.class);
		//can put InkPen/MarkerPen/Pen - whatever but displays only mentioned in bean class
		//prints - InkPen as per mentioned in bean class
		//no other bean should be present
		
//		Pen pen1 = (Pen) applicationContext.getBean("pen1"); // As per mentioned in id with bean class

		
		pen.write();
//		pen1.write();
    }
}
