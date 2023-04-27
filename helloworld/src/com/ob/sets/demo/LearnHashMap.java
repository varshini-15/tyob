package com.ob.sets.demo;

import java.util.HashMap;
import java.util.Map;


public class LearnHashMap {
	public static void main(String[] args) {
		Map<String, Student1> set = new HashMap<String, Student1>();
		//Set<Student1> set = new TreeSet<Student1>((o1,o2)-> o1.getAge() - o2.getAge());
		
		set.put("A",null);
		set.putIfAbsent("A",new Student1("HashSet2", 20, 98.00)); //prints hashset2....
		
		set.put("C",new Student1("HashSet1", 21, 97.00));
		set.put("D",new Student1("HashSet2", 20, 98.00));
		set.put("E",new Student1("HashSet3", 22, 98.00));
		set.put("F",new Student1("HashSet4", 24, 98.00));
		
		Student1 stu = set.get("C");
		System.out.println(stu);
		for(Map.Entry m:set.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
	}
}
