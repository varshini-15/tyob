package com.ob.collections.demo.copy;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private double percentage;

	public Student(String string, int i, double d) {
		this.name = string;
		this.age = i;
		this.percentage = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Student student) {
		
		return this.age - student.getAge();
	}
}
