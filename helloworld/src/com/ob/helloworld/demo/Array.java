package com.ob.helloworld.demo;

import java.lang.Math;

public class Array {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 2, 33 };

		// Prime Number
		System.out.println("Prime Number");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 2; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println();

		// Sort
		System.out.println("Sorting");
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();

		// Even and Odd number
		System.out.println("Even number :");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);

			}
		}
		System.out.println();
		System.out.println("Odd number :");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);

			}
		}

		// Second largest number
		int arr1[] = { 3, 4, 7, 1 };
		int first_highest = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > first_highest) {
				first_highest = arr1[i];
			}
		}
		System.out.println();
		System.out.println("First highest number : " + first_highest);
		int second_highest = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > second_highest && arr1[i] < first_highest) {

				second_highest = arr1[i];
			}
		}
		System.out.println("Second highest number : " + second_highest);
		System.out.println();
		// Smallest number
		// int arr1[] = {3,4,7,1};
		int smallest = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] < smallest) {
				smallest = arr1[i];
			}
		}
		System.out.println("Smallest : " + smallest);
		System.out.println();
		// reverse array
		System.out.println("Reverse");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse Character");
		char[] ch = { 'a', 'b', 'c', 'd' };
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse String");
		String[] s = { "abc", "cvb", "bnm" };
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.println();

		// Fibonacci series
		System.out.println("Fibonacci Series :");
		int n = 10;
		int a = 0, b = 1, c;
		System.out.print(a + " ");
		System.out.print(b);
		for (int i = 2; i <= n; i++) {
			if (n >= 2) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
		}
		System.out.println();
		System.out.println();

		// Palindrome number
		int number = 1221;
		int temp1 = number;
		int rem, reverseNum = 0;
		while (number != 0) {
			rem = number % 10;
			reverseNum = (reverseNum * 10) + rem;
			number /= 10;
		}
		if (temp1 == reverseNum) {
			System.out.println(temp1 + " : Palindrome");
		} else {
			System.out.println(temp1 + " : Not a Palindrome");
		}

		// Palindrome string
		String str = "msdam", revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (str.equals(revStr)) { // equal checks content vs == checks reference
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a Palindrome String");
		}

		// Armstrong Number
		int arms = 371;
		int tempArms = arms;
		int length = 0;
		int remain, rev = 0;
		while (arms != 0) {
			remain = arms % 10;
			length++;
			arms /= 10;
		}

		arms = tempArms;
		while (arms != 0) {
			remain = arms % 10;
			rev += Math.pow(remain, length);
			arms /= 10;
		}
		if (tempArms == rev) {
			System.out.println(tempArms + " : Armstrong number");
		} else {
			System.out.println(tempArms + " : Not an armstrong number");
		}

		// Factorial number
		int nFact = 4;
		int fact = 1;
		for (int i = 1; i <= nFact; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + nFact + " : " + fact);

	}
}
