package com.ob.classes;

public class Father extends Grandpa{
	int money2;
	Father(int money2) {
		super(100);
		this.money2 = money2;
		System.out.println(money2);
		System.out.println("2nd level Constructor");
	}
}
