package com.ob.jdbc;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Jdbcc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String query ="insert into employee values(102,'Ramya',200000.00,21,'tester')";
		System.out.println(query);
		//		static way 
//		Driver driver;
//		try {
//			driver = new Driver();
//			DriverManager.registerDriver(driver);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
//		Dynamic way
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyob","root","Onebill@2020");
			Statement statement=connection.createStatement(); 
//			statement.execute("desc employee");
//			statement.execute("insert into employee values(100,'Varshini',1000000.00,25)"); 
//			statement.execute("delete from employee where age = 25");
//			statement.execute("alter table employee add designation varchar(30)");
//			statement.execute("insert into employee values(101,'Varshini Saravanan',2000000.00,26,'developer')"); 
			statement.execute(query);
//			statement.execute("truncate table employee");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
