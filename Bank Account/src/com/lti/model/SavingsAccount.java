package com.lti.model;

public class SavingsAccount extends Account {
	private static final SavingsAccount SavingsAccount = null;
	private double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public void displayAccount(SavingsAccount Saccount) {

		System.out.println(super.getAccountNo() + " " + super.getAccountBalance() + " " + super.getAccountPassword()
				+ " " + super.getBankName() + " " + getMinimumBalance());
		// super.displayAccount(Saccount);
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNo, double accountBalance, int accountPassword, double minimumbalance) {
		super(accountNo, accountBalance, accountPassword);
		// TODO Auto-generated constructor stub
		this.minimumBalance = minimumbalance;

	}

//	@Override
//	public void withdraw(double x) {
//		displayAccount( SavingsAccount );
//		System.out.println("Account Balance left: " + (accountBalance - x));
//
//	}

}
