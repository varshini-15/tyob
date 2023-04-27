package com.ob.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyob","root","Onebill@2020");
			System.out.println(connection);
			Statement statement=connection.createStatement(); 
			ResultSet resultSet = statement.executeQuery("select * from employee");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	
	}
}
