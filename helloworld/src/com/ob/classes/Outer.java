package com.ob.classes;



public class Outer {
int a = 10;
class Inner{
	int b = 20;
	
	class Inner2{
		int c = 30;
	}
	
}
static class Static_inner{
	int st = 55;
}

public static void main(String[] args) {
	Outer outer = new Outer();
	System.out.println(outer.a);
	Outer.Inner inner = outer.new Inner();
	System.out.println(inner.b);
	Outer.Inner.Inner2 inner2 = inner.new Inner2();
	Static_inner static_inner = new Static_inner();
	System.out.println(static_inner.st);
	System.out.println();
}
}
