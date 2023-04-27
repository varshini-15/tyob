package com.ob.classes;

public class ArithTest {
	public static void main(String[] args) {
		AithmeticOper arithTest = new AithmeticOper();
		
		//Creation by Reference
		AithmeticOper at = new AithmeticOper();
		System.out.println((at.a = 100) + (at.b = 200));
		
		//creation by Methods
		arithTest.getNum(100,20);
		arithTest.displayNum();
		arithTest.addNum();
		arithTest.subNum();
		arithTest.mulNum();
		arithTest.divNum();
		arithTest.modNum();
		
		
	}
}
