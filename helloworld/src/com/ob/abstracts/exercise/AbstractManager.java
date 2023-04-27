package com.ob.abstracts.exercise;

public class AbstractManager extends AbstractUser {

	void balance() {
		if (initial_amount > withdraw_amount) {
			int balance_amount = initial_amount - withdraw_amount;
			System.out.println("Balance amount : " + balance_amount);
		} else {
			System.out.println("Cant withdraw");
		}

	}
	
	
	
	

}
