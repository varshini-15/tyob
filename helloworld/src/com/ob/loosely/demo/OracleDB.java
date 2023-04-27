package com.ob.loosely.demo;

public class OracleDB implements apiInterface {
	public void store() {
		System.out.println("Storing in OracleDB");
	}
	public void update() {
		System.out.println("Updating in OracleDB");
	}
	public void connect() {
		System.out.println("Connection in OracleDB");
	}
	public void retrieve() {
		System.out.println("Retrieve in OracleDB");
	}
}
