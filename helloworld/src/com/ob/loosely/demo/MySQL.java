package com.ob.loosely.demo;

public class MySQL implements apiInterface{
	public void store() {
		System.out.println("Storing in MySQL");
	}
	public void update() {
		System.out.println("Updating in MySQL");
	}
	public void connect() {
		System.out.println("Connection in MySQL");
	}
	public void retrieve() {
		System.out.println("Retrieve in MySQL");
	}
}
