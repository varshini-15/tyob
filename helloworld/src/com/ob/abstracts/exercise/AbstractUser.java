package com.ob.abstracts.exercise;

abstract class AbstractUser {
	//contains static
	String user_name;
	String password;
	int initial_amount = 1000;
	int withdraw_amount;

	AbstractUser() {
		System.out.println("Welcome to the Bank");
	}

//	abstract void check_password();
	

	abstract void balance();

	void withdraw() {

		System.out.println(withdraw_amount);
	}

}
