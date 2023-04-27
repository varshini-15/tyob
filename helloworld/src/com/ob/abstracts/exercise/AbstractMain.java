package com.ob.abstracts.exercise;
import java.util.*;
public class AbstractMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		AbstractUser absUser = new AbstractManager();
		System.out.println("Enter user name : ");
		absUser.user_name = s.nextLine();
		System.out.println("Enter password : ");
		absUser.password = s.nextLine();
		System.out.println("Enter amount to withdraw : ");
		absUser.withdraw_amount = s.nextInt();
		absUser.balance();
		
	}
}
