package com.ob.loosely.demo;

public class MongoDB implements apiInterface{
	public void store() {
		System.out.println("Storing in MongoDB");
	}
	public void update() {
		System.out.println("Updating in MongoDB");
	}
	public void connect() {
		System.out.println("Connection in MongoDB");
	}
	public void retrieve() {
		System.out.println("Retrieve in MongoDB");
	}
}
