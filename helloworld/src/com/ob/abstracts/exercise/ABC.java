package com.ob.abstracts.exercise;

class A{
	A(){
		System.out.println("A");
	}
	{
	System.out.println("init");	
	}
	static {
		System.out.println("static");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
	{
		System.out.println("init");	
		}
}
class C extends B{
	C(){
		super();
		System.out.println("C");
	}
}
public class ABC {
	
public static void main(String[] args) {
	new C();
}
}
