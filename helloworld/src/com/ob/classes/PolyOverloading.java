package com.ob.classes;

import java.lang.*;

public class PolyOverloading {
	int password;

	void transaction() {
		System.out.println("Transaction begins");
		System.out.println("UserId:");
	}

	void transaction(String user_id) {
		System.out.println("Transaction by user Id");
		System.out.println("password:");
	}

	void transaction(int password) {
		this.password = password;
		String pass = Integer.toString(password);
		if (pass.length() != 4) {
			System.out.println("check your password....!");
			System.exit(0);
		}
		System.out.println("enter age ,gender");

	}

	void transaction(int age, String gender) {
		String gen = gender.toLowerCase();

		if (age < 18 && (gen.equals("m")  || gen.equals("w"))) {
			System.out.println("Transaction by age and gender ");
			System.out.println("Your Student Account is created");
		} else if (age >= 18 && (gen.equals("m")  || gen.equals("w"))) {
			System.out.println("Your account has been changed into Major Account");
		}

		else {
			System.out.println("please check your age and Gender");
		}
	}

}
