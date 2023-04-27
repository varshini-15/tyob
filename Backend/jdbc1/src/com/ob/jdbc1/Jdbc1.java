package com.ob.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String query ="insert into employee values(103,'Ramdhae',200000.00,'tester',24)";
//		System.out.println(query);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyob","root","Onebill@2020");
			Statement statement=connection.createStatement(); 
//			statement.execute("create table `employee`(`id` int primary key not null,`name` varchar(30),`salary` double,`designation` varchar(30))");
//			statement.execute("drop table employee");
//			statement.execute("alter table employee drop column extra");
//			System.out.println("Dropped column successfully");
//			statement.execute("alter table employee add age int");
			statement.executeQuery("insert into employee values(107,'Varshini',1000000.00,'developer',23)"); 
//			statement.execute("insert into employee values(104,'Ramye',100000.00,'developer',21)"); 
//			statement.execute("delete from employee where age = 21");
//			statement.execute(query);
			System.out.println("Deleted successfully");
			
			
//			statement.execute("insert into employee values(101,'Varshini Saravanan',2000000.00,26,'developer')"); 
			
//			statement.execute("truncate table employee");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
