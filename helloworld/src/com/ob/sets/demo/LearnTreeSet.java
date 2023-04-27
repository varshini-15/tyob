package com.ob.sets.demo;

import java.util.Comparator;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
	public static void main(String[] args) {
		//Comparator<Student1> c = (o1,o2)-> o1.getAge() - o2.getAge();
		Set<Student1> set = new TreeSet<Student1>();
		//Set<Student1> set = new TreeSet<Student1>((o1,o2)-> o1.getAge() - o2.getAge());
		set.add(new Student1("HashSet1", 21, 97.00));
		set.add(new Student1("HashSet2", 20, 98.00));
		set.add(new Student1("HashSet1", 21, 97.00));
		set.add(new Student1("HashSet2", 20, 98.00));
		set.add(new Student1("HashSet3", 22, 98.00));
		set.add(new Student1("HashSet4", 24, 98.00));
		//q	set.add(null); 	//exceptions are thrown -> comparator is used  (null.comparator is used)
						//hashcode not used
		set.forEach(s -> System.out.println(s));
	}
}
