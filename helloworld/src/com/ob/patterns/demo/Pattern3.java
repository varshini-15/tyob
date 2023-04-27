package com.ob.patterns.demo;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println();
		for (int i = n; i >= 1; i--) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k--);

			}

			System.out.println();

		}
		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k--);
				//

			}
			System.out.println();
		}
	}
}
