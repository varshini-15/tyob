package com.ob.exercisess;

public class Strings {
	void reverse(int length, String str) {
		if(length > 0) {
			System.out.println(str.charAt(length - 1));
			reverse(length - 1,str);
		}
	}
	public static void main(String[] args) {
		String str = "ffghii";
		char[] arr = str.toCharArray();
		System.out.println("Duplicate : " );
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			if (count == 2) {
				System.out.println(arr[i]);
			}

		}

		// Reverse a string without loop
		Strings strings = new Strings();
		System.out.println("Reverse");
		strings.reverse(str.length(), str);
		
		//Swapping without temp variable
		int a = 10,b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
