package com.ob.Vpay.demo;

import java.util.*;

public class BankUI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankDetails bankdetails = new BankDetails();
		String user_id;
		int amount;
		String bankChoice;
		
		
		System.out.println("User ID : ");
		user_id = sc.nextLine();
		System.out.println("Amount : ");
		amount = sc.nextInt();
		System.out.println("Select the bank : ");
		sc.nextLine();
		bankChoice = sc.nextLine();
		
		bankdetails.setUser_id(user_id);
		bankdetails.setAmount(amount);
		bankdetails.setBankChoice(bankChoice);
		
		bankdetails.setUser_id(user_id);
		bankdetails.setAmount(amount);
		bankdetails.setBankChoice(bankChoice);
		
		InterVpay user = BankConnect.bankconnect(bankChoice);
		user.transfer();
		user.balance();
	}

}
