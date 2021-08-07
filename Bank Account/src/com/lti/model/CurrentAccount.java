package com.lti.model;

public class CurrentAccount extends Account {
	private static final CurrentAccount CurrentAccount = null;
	double overdraftLimitAmount;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int accountNo, double accountBalance, int accountPassword,double overdraftLimitAmount) {
		super(accountNo, accountBalance, accountPassword);
		this.overdraftLimitAmount=overdraftLimitAmount;
		// TODO Auto-generated constructor stub
	}

	public double getOverdraftLimitAmount() {
		return overdraftLimitAmount;
	}

	public void setOverdraftLimitAmount(double overdraftLimitAmount) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}
	public void displayAccount(CurrentAccount Caccount){
		System.out.println(super.getAccountNo()+" "+super.getAccountBalance()+" "+super.getAccountPassword()+" "
				+super.getBankName()+" "+getOverdraftLimitAmount());
		this.overdraftLimitAmount=overdraftLimitAmount;
           }

	//@Override
//	public void withdraw( double x) {
//		displayAccount(CurrentAccount);
//		
//		System.out.println("Overdraft Limit Left: "+(overdraftLimitAmount-x));
//		
//		
//	}

	
}
