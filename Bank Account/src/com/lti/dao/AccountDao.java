package com.lti.dao;

import java.util.List;

import com.lti.model.Account;

public interface AccountDao {
	boolean addAnAccount(Account account);
	void withdraw(int accountNumber,double amount);
	void checkBalance();
	void changePassword(int accountNumber,String oldPassword,String newPassword);
	List<Account> viewAllAccounts();
	void getAccountDetails(int accountNumber);
	
}
