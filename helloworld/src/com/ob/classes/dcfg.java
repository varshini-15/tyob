package com.ob.classes;

public class dcfg {
	int age = 10;
	void getage(int age) {
		this.age = age;
		System.out.println(age );
	}
public static void main(String[] args) {
	dcfg dc = new dcfg();
	dc.getage(25);
	System.out.println(dc.age);
}
}
