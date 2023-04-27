package com.ob.whatsapp.demo;

public class Whatsapp {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.addUser();
		admin.sendMsg();
		// Recreating the users info in admin as well as deleting the users info
		// Upcasting as well as downcasting is used
		
		Users u = new Admin(); //creating an admin initially but behaves like users
		u.sendMsg();
		u.delMsg();
		u.readMsg();
		u.sendMedia();
		
	//	u.addUser(); //can't be used
		
		Admin a = (Admin)u; //here users turned into admin without del and recreating 
							// by creating obj for users and admin separately
		a.addUser();
		a.createAdmin();
		a.delUser();
		
		a.delMsg();
		a.sendMsg();
		a.sendMedia();
		a.readMsg();
	}
}
