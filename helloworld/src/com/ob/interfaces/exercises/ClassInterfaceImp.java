package com.ob.interfaces.exercises;

//import com.ob.interfaces.exercises.ClassInterface.ClInterface;

class ClassInterfaceImp implements ClassInterface.ClInterface{
	public void msg() {
		System.out.println("class inside interface");
	}
}




















/*

public class Sample {
	   interface myInterface{
	      void demo();
	   }
	   class InnerClass implements myInterface{
	      public void demo(){
	         System.out.println("Welcome to Tutorialspoint");
	      }
	   }
	   public static void main(String args[]){
	      InnerClass obj = new Sample().new InnerClass();
	      obj.demo();
	   }
	}*/