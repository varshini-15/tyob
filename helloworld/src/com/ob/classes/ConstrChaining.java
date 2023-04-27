package com.ob.classes;

public class ConstrChaining {

	ConstrChaining() { //

		this(5); // 
		System.out.println("The Default constructor");
	}

	ConstrChaining(int x) {

		this(5, 15);
		System.out.println(x);
	}

	ConstrChaining(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {

		new ConstrChaining();
	}

}
