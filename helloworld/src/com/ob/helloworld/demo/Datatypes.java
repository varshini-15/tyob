package com.ob.helloworld.demo;

public class Datatypes {
//	public static void main(String[] args) {
	static void main(String[] args) {
		byte b1 = 1;
		short s1 = 2;
		int i1 = 3;
		long l1 = 4;
		float f1 = 6.0f;
		double d1 = 8.0d;
		
		//implicit
		
		double d2 = i1;
		float f2 =l1;
		long l2 = i1;
		int i2 = s1;
		short s2 = b1;
	
		System.out.println("Implicit");
		System.out.println(d2);
		System.out.println(f2);
		System.out.println(l2);
		System.out.println(i2);
		System.out.println(s2);
		
		//explicit
		
		byte b3= (byte)i1;
		float f3 = (float)d1;
		long l3 = (long)f1;
		int i3 = (int) d1;
		short s3 = (short) f1;
		
		System.out.println("Explicit");
		System.out.println(b3);
		System.out.println(f3);
		System.out.println(l3);
		System.out.println(i3);
		System.out.println(s3);
		
	}

}
