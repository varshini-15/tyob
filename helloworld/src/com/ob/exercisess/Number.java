package com.ob.exercisess;

public class Number {
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {

		int neon = 1;
		int neon2 = neon * neon;
		int remainder = 0, sum = 0;
		while (neon2 != 0) {
			remainder = neon2 % 10;
			sum += remainder;
			neon2 /= 10;
		}
		if (sum == neon) {
			System.out.println("Neon number");
		} else {
			System.out.println("Not a neon number");
		}

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
		fact(9);
		// Strong number
		int number1 = 145;
		int strong = number1;
		int remai, revers = 0;
		int strong_num = 0;
		while (strong != 0) {
			remai = strong % 10;
			strong_num += fact(remai);
			strong /= 10;
		}

		if (number1 == strong_num) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a strong number");
		}

		int number2 = 12;
		int sum1 = 0;
		for (int i = 1; i <= number2/2; i++) {
			if (number2 % i == 0) {
				sum1 += i;
			}

		}
		if (sum1 == number2) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not a perfect number");
		}

	}
}
