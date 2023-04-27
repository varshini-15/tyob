package com.ob.assessment3;

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
    	CollectionsSpring collectionsSpring=(CollectionsSpring)context.getBean("collections");

    	collectionsSpring.getAddressList();
    	collectionsSpring.getAddressSet();
    	collectionsSpring.getAddressMap();
    	collectionsSpring.getAddressProp();
    }
}
