package com.ob.patterns.demo;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");

			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			int m = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(m-- + " ");

			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			int m = i;
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(m + " ");
				} else {
					System.out.print((m + 5 * (j - 1)) + " ");
				}

			}

			System.out.println();

		}
	}
}
