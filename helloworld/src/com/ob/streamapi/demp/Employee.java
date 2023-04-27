package com.ob.streamapi.demp;

import java.time.LocalDate;

enum Rating{
	Zero(0),One(1),Two(2),Three(3),Four(4),Five(5);
	int state;
	Rating(int state){
		this.state = state;
	}
	
}
enum Gender{
	Male("Male"),Female("Female"),Others("Others");
	String state;
	Gender(String state){
		this.state = state;
	}
	
	
}

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", salary="
				+ salary + ", rating=" + rating + ", doj=" + doj + "]";
	}
	public Employee() {
		super();
		
	}
	public Employee(long id, String name, Gender gender, String email, double salary, Rating rating, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.salary = salary;
		this.rating = rating;
		this.doj = doj;
	}
	private long id;
	private String name;
	private Gender gender;
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	private double salary;
	private Rating rating;
	private LocalDate doj;

}
