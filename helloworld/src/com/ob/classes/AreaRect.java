package com.ob.classes;

public class AreaRect {
	int l, b;

	void getDimesions(int l, int b) {
		this.l = l;
		this.b = b;
	}
	void areaOfRect() {
		System.out.println("Area of rectangle : " + l*b);
	}
}
