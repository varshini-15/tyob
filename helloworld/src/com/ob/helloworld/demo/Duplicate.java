package com.ob.helloworld.demo;

public class Duplicate {
	public static void main(String[] args) {
		
		int[] arr = {1, 1,2, 3, 3, 4, 4, 4, 4, 5, 2, 6 ,6};
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
	}
}
