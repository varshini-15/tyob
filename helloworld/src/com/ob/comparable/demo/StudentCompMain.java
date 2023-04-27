package com.ob.comparable.demo;

import java.util.Arrays;
import java.util.Comparator;

//class ComparatorOnPercentage implements Comparator<StudentComp> {
//	@Override
//	public int compare(StudentComp s1, StudentComp s2) {
//		return (int) (s1.getPercentage() - s2.getPercentage());
//	}
//}
//
//class ComparatorOnAge implements Comparator<StudentComp> {
//	
//	@Override
//	public int compare(StudentComp s1, StudentComp s2) {
//		return s1.getAge() - s2.getAge();
//	}
//}

public class StudentCompMain {
	public static void main(String[] args) {
		StudentComp[] student = { 
				new StudentComp("Varsh ", 24, 98.79), 
				new StudentComp("Varsh1", 20, 98.89),
				new StudentComp("Varsh2", 23, 98.59), 
				new StudentComp("Varsh3", 21, 98.80),

		};
		String sortOn = "aGe";
		Comparator<StudentComp> comparator;
		
		
// 		One way		
//		if (sortOn.￼equalsIgnoreCase("age")) {
//			comparator = new ComparatorOnAge();
//		} else {
//			comparator = new ComparatorOnPercentage();
//		}
		
//		One way	
//		if (sortOn.equalsIgnoreCase("age")) {
//			comparator = (StudentComp s1,StudentComp s2) ->  {
//			return (s1.getAge() - s2.getAge());
//			};
//		} else {
//			comparator = (StudentComp s1,StudentComp s2) ->  {
//				return (int) (s1.getPercentage() - s2.getPercentage());
//			};
//		}
		
//		One way	
// when using this below stamnts no need of class definition above mentioned
		
		if (sortOn.equalsIgnoreCase("age")) {
			comparator = (s1,s2) ->  s1.getAge() - s2.getAge();
		} else {
			comparator = (s1, s2) ->  (int) (s1.getPercentage() - s2.getPercentage());
		}
		
		
//		One way		
//		ComparatorOnPercentage comparatorOnPercentage =new ComparatorOnPercentage();
//		Arrays.sort(student, comparatorOnPercentage);
		
		
//		Arrays.sort(student, comparator);
		for (StudentComp studen : student) {
			System.out.println(studen);
		}
	}
}

// Comparator is used when class is said to be final
// (case : can't sort for different ways)
// Comparable => uses this keyword vs In comparator two objects are passed
// when seeing the comparator definition the same bubble sort will be implemented

//Lambda expression, creates a class of the implemented class of those interface
