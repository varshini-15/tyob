package com.ob.loosely.demo;

public class DBConnect {

	static apiInterface dbconnect(String type) {

		if (type.equals("MySQL")) {
			return new MySQL();
		} else if (type.equals("OracleDB")) {
			return new OracleDB();
		}
		else if(type.equals("MongoDB")){
			return new MongoDB();
		}
		return null;
	}
}
