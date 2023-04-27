package com.ob.patterns.demo;

public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			int k = 5;
			for (int j = 1; j <= i; j++) {
				System.out.print(k-- + " ");

			}

			System.out.println();

		}
		System.out.println();
		for (int i = n; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print( j+" ");

			}

			System.out.println();

		}
	}
}
