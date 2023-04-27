package com.ob.patterns.demo;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 5;
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//
//			}
//			int k = 1;
//			for (int j = 0; j < i; j++) {
//				
//					System.out.print(k + " ");
//					k = k*(i-j)/(j+1);
//				}
//				
//		}
				for(int i=0; i<n; i++)
			      {
					for (int j = 1; j <= n - i; j++) {
						System.out.print(" ");
	
					}
			         int k=1;
			         for(int j=0; j<=i; j++)
			         {
			            System.out.print(k+ " ");
			            k = k*(i-j)/(j+1);
			         }
			         System.out.print("\n");
			      }

			

			System.out.println();

		}
	}

//if(j == 1) {
//System.out.print(j + " " );
//}else if(j == i){
//k = (j + 1)- (i);
//System.out.print( k+ " ");
//}else {
//System.out.print((i + (k-2)) + " ");
//}

//using recursion
//for (int i = 0; i <= n; i++) {
//    for (int j = 0; j <= n - i; j++) {
//        System.out.print(" ");
//    }
//
//    for (int k = 0; k <= i; k++) {
//        System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
//    }
//
//    System.out.println();
//}
//}
//
