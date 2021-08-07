package com.lti.dao;


import java.util.ArrayList;
import java.util.List;

import com.lti.model.Account;
public class InMemoryAccountDaoImpl implements AccountDao {

	static List<Account> accounts = new ArrayList<Account>(); 


	
	public InMemoryAccountDaoImpl() {
		accounts.add(new Account(1001, 2000,1111));
		accounts.add(new Account(1002,7000,3333 ));
		accounts.add(new Account(1003,5000,7777 ));
		accounts.add(new Account(1004,6000,5555 ));
		accounts.add(new Account(1005, 4000,6666));
		

	}

@Override
public boolean addAnAccount(Account account) {
	// TODO Auto-generated method stub
	return accounts.add(account);
}

@Override
public void withdraw(int accountNumber, double amount) {
	// TODO Auto-generated method stub
	
}

@Override
public void checkBalance() {
	// TODO Auto-generated method stub
	
}

@Override
public void changePassword(int accountNumber, String oldPassword, String newPassword) {
	// TODO Auto-generated method stub
	
}

@Override
public List<Account> viewAllAccounts() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void getAccountDetails(int accountNumber) {
	// TODO Auto-generated method stub
	
}

}
	





