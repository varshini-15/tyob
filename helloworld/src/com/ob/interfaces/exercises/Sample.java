package com.ob.interfaces.exercises;


public class Sample {
	   interface myInterface {
	      void demo();
	   }
	   class Inner implements Sample.myInterface {
	      public void demo() {
	         System.out.println("Welcome to Tutorialspoint");
	      }
	   }
	   public static void main(String args[]) {
	      Inner obj = new Sample().new Inner();
	      obj.demo();
	   }
	}