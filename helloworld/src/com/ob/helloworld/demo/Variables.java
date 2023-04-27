package com.ob.helloworld.demo;

import java.util.*;

public class Variables {

	
	int instanceVariable;
	static int staticVariable;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//Local Variable
		int localVariable = s.nextInt();
		System.out.println("Local Variable :" + localVariable);

		Variables variables = new Variables();
		
		//Instance Variable
		variables.instanceVariable = s.nextInt();
		System.out.println("Instance Variable : " + variables.instanceVariable);
		
		//Static Variable
		Variables.staticVariable = s.nextInt();
		System.out.println("Static Variable(using object reference) : " + variables.staticVariable);
		System.out.println("Static Variable : " + Variables.staticVariable);
	}
}
