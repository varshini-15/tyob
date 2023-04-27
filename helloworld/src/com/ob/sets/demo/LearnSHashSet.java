package com.ob.sets.demo;
//set no sorting, no duplicates
import java.util.HashSet;
import java.util.Set;

public class LearnSHashSet {

	public static void main(String[] args) {
		Set<Student1> set = new HashSet<Student1>();
		set.add(new Student1("HashSet1", 21, 97.00));
		set.add(new Student1("HashSet2", 20, 98.00));
		set.add(new Student1("HashSet1", 21, 97.00));
		set.add(new Student1("HashSet2", 20, 98.00));
		set.add(new Student1("HashSet3", 22, 98.00));
		set.add(new Student1("HashSet4", 24, 98.00));
		
		set.forEach(s-> System.out.println(s));
	}
}
