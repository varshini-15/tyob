package com.ob.loosely.demo;

public class DBDriver {

	public static void main(String[] args) {
		
//		apiInterface c = new MySQL();
//		c.store();
		
		
		apiInterface api = DBConnect.dbconnect("OracleDB");
		apiInterface api1 = DBConnect.dbconnect("MongoDB");
		
		api.store();
		api.update();
		api.connect();
		api.retrieve();
		
		api1.store();
		api1.update();
		api1.connect();
		api1.retrieve();
	}

}
