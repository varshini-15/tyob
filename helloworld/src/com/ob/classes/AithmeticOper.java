package com.ob.classes;

public class AithmeticOper {
	
		int a,b;
		int n1 = 200,n2 = 60;
		void getNum(int x, int y) {
			a = x;
			b = y;
		}
		void displayNum() {
			System.out.println("The numbers are "+a+" "+b);
		}
		void addNum() {
			System.out.println(a + b);
		}
		void subNum() {
			System.out.println(a - b);
		}
		void mulNum() {
			System.out.println(a * b);
		}
		void divNum() {
			System.out.println(a / b);
		}
		void modNum() {
			System.out.println(a % b);
		}
	}


