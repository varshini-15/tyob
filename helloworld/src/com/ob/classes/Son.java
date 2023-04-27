package com.ob.classes;

public class Son extends Father {
	int money3;
	Son(int money3) {
		super(500);
		this.money3 = money3;
		System.out.println(money3);
		System.out.println("3rd level Constructor");
	}
}
