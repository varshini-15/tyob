package com.ob.collections.demo.copy;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LearnLinkedList  {
	public static void main(String[] args) {

		List<Student> arraylist = new LinkedList<Student>();
		arraylist.add(new Student("Linked1", 21, 97.00));
		arraylist.add(new Student("Varsh2", 20, 98.00));
		arraylist.add(new Student("Varsh3", 22, 98.00));
		arraylist.add(new Student("Varsh4", 24, 98.00));

		// 1
		for (Student student : arraylist) {
			System.out.println(student);
		}
		System.out.println("=================================================");
		
		
		//2
		for(int i = 0;i <arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println("=================================================");
		
		
		//3
		Consumer<Student> consumer = s-> System.out.println(s);
		arraylist.forEach(consumer);
		System.out.println("=================================================");
		
		
		//4
		arraylist.stream().forEach(consumer);
		System.out.println("=================================================");
		
		
		//5
		Iterator<Student> iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("=================================================");
		
		Comparator<Student> c = (o1, o2)-> o1.getAge() - o2.getAge(); 
		Collections.sort(arraylist, c);
		//6.a
		ListIterator<Student> listiterator = arraylist.listIterator();
		while(listiterator.hasNext()) {
			Student student = (Student) listiterator.next();
			System.out.println(student);
		}
		//6.b
		while(listiterator.hasPrevious()) {
			Student student = (Student) listiterator.previous();
			System.out.println(student);
		}
		
	}

}
