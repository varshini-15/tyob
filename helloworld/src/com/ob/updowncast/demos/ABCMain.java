package com.ob.updowncast.demos;

public class ABCMain {
	public static void main(String[] args) {
		A a = new B();
		//C c = (C)a;
		//c.m1();
		
		//soln for classCastException
		
		
		B b= new C();
		//B b = (B)a;   //reference only (can't use)
		C c = (C)b;
		c.m1();
		
	}
}
