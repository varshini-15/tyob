//public int compareTo(StudentComp stud) {
//	
//	return this.getAge() - stud.getAge();
//}
package com.ob.comparable.demo;

public final class StudentComp implements Comparable<StudentComp> {
	private String name;
	private int age;
	private double percentage;

	public StudentComp(String name, int age, double percentage) {
	
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
		//System.out.println(age);
	}
	public int getAge() {
		return age;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getPercentage() {
		return percentage;
	}
	
	@Override
	public String toString() {
		return " student[name : " + name + " age: " + age+ " percentage : "+ percentage +"]";
	}
	@Override
	public int compareTo(StudentComp stud) {
		
		return this.getAge() - stud.getAge();
	}
//	@Override
//	public int compareTo(Object obj) {
//		StudentComp stud = (StudentComp) obj;
//		return this.getAge() - stud.getAge();
//		
//	}

	
	
}
