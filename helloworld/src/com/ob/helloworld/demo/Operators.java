package com.ob.helloworld.demo;
import java.util.*;
public class Operators {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 90;
		int num2 = 20;
		
	//Arithmetic Operators
		
		System.out.println("Addition : " + (num1 + num2));
		System.out.println("Subtraction : " + (num1 - num2));
		System.out.println("Multiplication : " + (num1 * num2));
		System.out.println("Division : " + (num1 / num2));
		System.out.println("Modulus : " + (num1 % num2));
		
	//Relational Operators
		
		System.out.println("Greater than : " + (num1 > num2));
		System.out.println("Lesser than : " + (num1 < num2));
		System.out.println("Greater than or equal to : " + (num1 >= num2));
		System.out.println("Lesser than or equal to : " + (num1 <= num2));
		System.out.println("Equal to : " + (num1 == num2));
		System.out.println("Not equal to : " + (num1 != num2));
		
	//Logical operators
		
	
		byte speed = 100;
		char license ='y';
		System.out.println();
		System.out.println("Can drive? : " + ((speed <= 80) && ((license == 'y') || (license == 'Y'))));
		
		System.out.println((speed <= 80) && (license == 'y'));
		System.out.println((speed <= 50) && (license == 'y'));
		System.out.println((speed <= 60) && (license == 'y'));
		System.out.println((speed <= 70) && (license == 'y'));
		
		System.out.println((speed <= 80) || (license == 'y'));
		System.out.println((speed <= 50) || (license == 'n'));
		System.out.println((speed <= 60) || (license == 'n'));
		System.out.println((speed <= 70) || (license == 'y'));
		
	//Unary Operator
		
		int numb1 = 10;
	    int numb2 = 20;
		
		//Pre - increment & Pre - decrement
		System.out.println(++numb1);		//101
		System.out.println(numb1);		//101
		System.out.println(--numb1);		//100
		System.out.println(numb1);		//100
		
		//Post - increment & Post - decrement
		System.out.println(numb2++);		//200
		System.out.println(numb2);			//201
		System.out.println(numb2--);		//201
		System.out.println(numb2);			//199

	//Logical vs Bitwise
		
		int a = 21;
		int b = 21;
		
		System.out.println(a & b);
		System.out.println(a | b);		// bitwise or of same number is same number
		System.out.println(a ^ b);
		
		boolean b1 = false;
		boolean b2 = true;
		
		//System.out.println( & b);
		//System.out.println(a | b);		// bitwise or of same number is same number
		//System.out.println(a ^ b);
		
	//All Operators
		
		int number1 = 21, number2 = 20;
		System.out.println( ( number1 >= (++number2) ) && ((number2 + 10) < (number1 | number2)));
		  				//         21 >= 21 && (21 + 10) < (21 | 21)
						//			false  &&  31 < 21
						//     		false && false
						//	   (Relational) (Unary)(logical)   (arithmetic)       (bitwise)
	float f = 10.0f;			// float to integer is narrowing & it can be done explicitly
	f += 10; 					//by using compound assignment it can be done implicitly   f(float) = (float) (f + 10) where 10 is integer
	System.out.println(f);
	
	}

}
