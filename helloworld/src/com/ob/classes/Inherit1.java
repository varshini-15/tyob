package com.ob.classes;

class Inherit{  
		 float salary=40000;  
		}  
		public class Inherit1 extends Inherit{  
		 int bonus=10000;  
		 public static void main(String args[]){  
			 Inherit1 p=new Inherit1();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  
		}  
		  
}
