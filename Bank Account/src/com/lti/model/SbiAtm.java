package com.lti.model;

import java.util.Scanner;

public class SbiAtm implements ATM {
	
	
	

	

	private double amount;

	@Override
	public void withdraw(int accountNumber, double amount) {
		this.amount=amount;
		System.out.println("Enter amount to be withdrawn:");
		
		
		
		
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		
		
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Balance: ");
		
	}

}
