package com.ob.classes;

public class Avg {
	int mark1, mark2, mark3, mark4, mark5;
	void getMarks(int mark1,int mark2,int mark3,int mark4,int mark5) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.mark5 = mark5;
		
	}
	void avgOfNum() {
		int average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
		System.out.println("Average : "+ average);
	}
}
