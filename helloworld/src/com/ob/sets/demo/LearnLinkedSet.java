package com.ob.sets.demo;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedSet {
	public static void main(String[] args) {
		Set<Student1> set = new LinkedHashSet<Student1>();
		set.add(new Student1("HashSet1", 21, 97.00));
		set.add(new Student1("HashSet2", 20, 98.00));
		set.add(new Student1("HashSet1", 21, 97.00));
		set.add(new Student1("HashSet2", 20, 98.00));
		set.add(new Student1("HashSet3", 22, 98.00));
		set.add(new Student1("HashSet4", 24, 98.00));
		set.add(null);
		set.add(null);//duplicate nulls are removed
					  //check student1 class hashcode equals are overriden
		set.forEach(s-> System.out.println(s));
		//set.get();//can't access valuess
	}
}

