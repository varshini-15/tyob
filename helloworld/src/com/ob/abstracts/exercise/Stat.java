package com.ob.abstracts.exercise;

public class Stat {
	static int i = 10;
	static void meth() {
		i = 1234;
	}
	public static void main(String[] args) {
		Stat.meth();
		System.out.println(Stat.i);
	}
}


// Static variables are used with the class name and the dot operator, since they are associated with a class, not objects of a class. Static methods cannot access or change the values of instance variables, but they can access or change the values of static variables. Static methods cannot call non-static methods.