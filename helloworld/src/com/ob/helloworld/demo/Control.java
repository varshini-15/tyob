package com.ob.helloworld.demo;

public class Control {
	public static void main(String[] args) {
		
		//nested if statement
		
		int minInterviewMark = 50;
		if (minInterviewMark >= 60) {
			int minTechMark = 89;
			if(minTechMark >= 50) {
				System.out.println("Allowed for the interview");
			} else {
				System.out.println("You are not allowed to Technical Round");
			} 
		}else {
			System.out.println("Not allowed for the interview");
		}
		
		//switch statement - case constants can be number, character(' '), string(" ")
		int week = 6;
		switch(week) {
		case 1 :	System.out.println("Sunday");
		 			break;
		case 2 :	System.out.println("Monday");
					break;
		case 3 :	System.out.println("Tuesday");
					break;
		case 4 :	System.out.println("Wednesday");
					break;
		case 5 :	System.out.println("Thursday");
					break;
		case 6 :	System.out.println("Friday");
					break;
		case 7 :	System.out.println("Saturday");
					break;
		default :   System.out.println("None!");
					break;
		 			
		}
		
	}

}
