package com.ob.patterns.demo;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}System.out.println();
		}

		System.out.println();
		for (int i = n; i >= 1; i--) {
			int k = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(k-- + " ");

			}

			System.out.println();

		}

		System.out.println();
		for (int i = 1; i <= n ; i++) {
			int k = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(k-- + " ");

			}

			System.out.println();

		}
		System.out.println();
		

	}
}
