package com.ob.streamapi.demp;

import java.util.ArrayList;
import java.util.List;



public class LearnStreamAPI {
	public static void main(String[] args) {
		List<Student2> arraylist = new ArrayList<Student2>();
		arraylist.add(new Student2("Varsh1", 21, 97.00));
		arraylist.add(new Student2("Varsh2", 20, 98.00));
		arraylist.add(new Student2("Varsh3", 22, 98.00));
		arraylist.add(new Student2("Varsh4", 24, 98.00));
		arraylist.stream().map(s ->{
			s.setAge(s.getAge()+1);
			return s;
		}).forEach(s -> System.out.println(s));
	}
}
