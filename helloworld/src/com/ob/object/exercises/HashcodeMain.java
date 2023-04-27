package com.ob.object.exercises;

class HashCode {
	int a = 1078;

	void display() {
		System.out.println(a);
	}
}

public class HashcodeMain {

	public static void main(String[] args) {
		HashCode hashcode1 = new HashCode();
		HashCode hashcode2 = new HashCode();
		
		HashcodeMain hm = new HashcodeMain();
		System.out.println(hashcode1.equals(hashcode2));
		System.out.println(hashcode1.hashCode());
		System.out.println(hashcode1.toString());
		System.out.println(hashcode1.getClass());
		//hashcode1.wait();
		//hm.main(args);
		
	}
}
