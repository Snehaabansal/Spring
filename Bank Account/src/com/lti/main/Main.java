//package com.lti.main;
//
//
//
//
//import java.util.Scanner;
//
//import com.lti.dao.AccountDao;
//import com.lti.dao.InMemoryAccountDaoImpl;
//import com.lti.model.Account;
//import com.lti.model.CurrentAccount;
//import com.lti.model.SavingsAccount;
//
//
//public class Main {
//
//	public static void main(String[] args) {
//	//scenario2();
//
//	}
//
////	public static void scenario1() {
////		Account account1 = new Account(1000001, 35744.22, 1223);
////
////		account1.displayAccount(account1);
////
////	}
////	public static void scenario2() {
////		SavingsAccount Saccount  = new SavingsAccount(101, 200.125, 1223,100);
////
////		//Saccount.displayAccount(Saccount);
////	//Saccount.displayAccount(Saccount);
////	Scanner sc= new Scanner(System.in);
////	double withdraw;
////	//SavingsAccount s1=new SavingsAccount();
////	CurrentAccount c1=new CurrentAccount(102,400.50, 2339,50);
////	System.out.println("Enter amount to be withdrawn:");
////	withdraw=sc.nextInt();	
////	Saccount.withdraw(withdraw);
////	c1.withdraw(withdraw);
////		
////
////	}
//	AccountDao accountDao = new InMemoryAccountDaoImpl();
//
//	boolean flag = true;
//	Scanner sc = new Scanner(System.in);
//	//do {
//		System.out.println(
//				"1.Add an Account\n2.Withdraw\n3.Check Balance\n"
//				+ "4.Change Password\n5.Get Account Details\n6.Enroll\n7. View All Enrollments");
//		int ch = sc.nextInt();
//		 int accountNo;
//		double accountBalance;
//		 int accountPassword;
//		Account account;
//
//		switch (ch) {
//
//		case 1:
//			// System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
//			// id = sc.nextInt(); as id is auto generated in persistent class sql sequence
//			// query so we commented it and taking directly the name
//			System.out.println("Enter your Account No.");
//			accountNo = sc.next();
//			accountBalance=sc.nextDouble();
//			accountPassword=sc.nextInt();
//			account = new Account(accountNo, accountBalance,accountPassword);
//
//			
//			
//
//			boolean result = accountDao.addAccount(account); studentDao.addStudent(student);
//			if (result) {
//				System.out.println("Congratulations!! Your registration is successful.");
//			} else {
//				System.out.println("Sorry!! Registration failed.");
//			}
//
//			break;
//	
//	
//	
//
//	
////}