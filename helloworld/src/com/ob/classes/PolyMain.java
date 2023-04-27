package com.ob.classes;
import java.util.*;
public class PolyMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Polymorphism Overloading");
		PolyOverloading polyoverloading = new PolyOverloading();
		polyoverloading.transaction();
		//s.nextLine();
		polyoverloading.transaction(s.next());
		
		polyoverloading.transaction(s.nextInt());
		int i = s.nextInt();
		s.nextLine();
		String j = s.next();
		s.nextLine();
		polyoverloading.transaction(i,j);
	}
}
