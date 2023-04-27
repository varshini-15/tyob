package com.ob.Vpay.demo;

public class BankDetails {
	private String user_id;
	private int amount;
	private String bankChoice;

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getBankChoice() {
		return bankChoice;
	}

	public void setBankChoice(String bankChoice) {
		this.bankChoice = bankChoice;
	}

}
