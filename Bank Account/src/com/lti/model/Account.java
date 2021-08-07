package com.lti.model;

public  class Account {

	private int accountNo;
	protected double accountBalance;
	private int accountPassword;
	private static String bankName;
	static {
		bankName = "SBI";
		
	}
	public Account() {
		
	}
	public Account(int accountNo, double accountBalance, int accountPassword) {
		
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		Account.bankName=bankName;
		
	}
	
public void displayAccount(Account account) {
		
		System.out.println(account.getAccountNo()+" "+account.getAccountBalance()+" "+account.getAccountPassword()+" "+Account.getBankName());
	}
	


 
//abstract void withdraw (double x) ;
	
	
}