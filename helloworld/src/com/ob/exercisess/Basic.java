package com.ob.exercisess;



public class Basic {
		
		 long factFunc(long n) {
			if (n == 1) {
				return n;
			} else {
				return (n * factFunc(n - 1));
			}
		}
		 int n1 = 0, n2 = 1,n3 = 0;
		 
		 void fibo(long n) {
			 
			 if (n > 0) {
				 n3 = n1 + n2;
				 n1 = n2;
				 n2 = n3;
				// System.out.println(n2);
				 System.out.print(n3 + " ");
				 fibo(n - 1);
			 }
			
		 }

		public static void main(String[] args) {

			// Leap year
			int year = 2020;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("Leap Year");

			} else {
				System.out.println("Not a leap yar");
			}

			// Factorial without loop
			long num = 5;
			Basic basic = new Basic();
			System.out.println("Factorial : " + basic.factFunc(num));

			//Fibonacci series without loop
			System.out.print("Fibonacci Series : 0 1 ");
			basic.fibo(num - 2);
			System.out.println();
			
			//Largest number in array
			int arr1[] = { 3, 4, 7, 1 };
			int highest_num = arr1[0];
			for (int i = 1; i < arr1.length; i++) {
				if (arr1[i] > highest_num) {
					highest_num = arr1[i];
				}
			}
			System.out.println("LargestNumber : " + highest_num);

			Boolean odd_even = true;
			for(int i = 1;i <= num;i++) {
				odd_even = !odd_even;
				
			}
			/*if(((num / 2) * 2) == num) {
				System.out.println("Even");
			}
			
			else {
				System.out.println("odd");
			}*/
			if(odd_even == true) {
				System.out.println(num + " : Even number");
			} else {
				System.out.println(num + " : Odd number");
			}
			
		}
		
	}


