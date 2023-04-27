package com.ob.exercisess;

public class PerfectNum {
	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		
		}
		System.out.println(sum);
	}
}
