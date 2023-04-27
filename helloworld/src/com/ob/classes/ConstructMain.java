package com.ob.classes;

public class ConstructMain {
	public static void main(String[] args) {
		Constructors constructors = new Constructors();
		Constructors constructors1 = new Constructors(10,"Varshini");
		
        System.out.println("ID : " + constructors1.id);
        System.out.println("Password : " + constructors1.password);
        System.out.println("Amount : " + constructors.amount);
	}
}
