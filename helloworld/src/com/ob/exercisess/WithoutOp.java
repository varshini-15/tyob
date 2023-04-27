package com.ob.exercisess;


public class WithoutOp {

		public static void main(String[] args) {
			int dividend = 28,divisor = 5;
			
			
			// Remainder without operator
			System.out.println("Remainder = " + (dividend - ((dividend / divisor) * divisor)));  
			// 				=> by formula dividend = divisor * quotient + remainder
		
			//Addition without operator
			int num1 = 234, num2 = 345;
			num2 = -num2;
			System.out.println("Addition : " + (num1 - num2));
			
			//Subtraction without operator
			int n1 = 34, n2 = 23;
			System.out.println(n1 + (~n2) + 1);
		
			//Multiplication without operator
			int a = 1700,b = 5;
			int temp = a;
			for(int i = 1;i < b;i++) {
				temp += a;
			}
			System.out.println(temp);
			//System.out.println();

		}
	}
	//if(dividend < divisor) {
//		System.out.println(dividend);
	//}
	//int x = 1;
	//int i = 1;
	//while(x < dividend) {
//		x = i * divisor;
//		i++;
	//}
	////System.out.println(x);
	//if(x == dividend) {
//		int rem = 0;
//		System.out.println("Remainder = "+ rem);
	//} else {
//		System.out.println("Remainder = " + (dividend - (x - divisor)));
	//}

	//for(int i = 1;i <= num2;i++) {
//		num1++;
	//}





