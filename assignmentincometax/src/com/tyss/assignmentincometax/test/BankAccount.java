package com.tyss.assignmentincometax.test;

public class BankAccount {
	String name;
	double amount;
	long accno;
	double balance;
	String bname;
	String type;


	void deposit(double amount) {
		if(amount>0) {
			balance = + amount;
		}else {
			System.out.println("amount is not deposited");
		}
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance = -amount;
		}else {
			System.out.println("insufficient balance for withdrawing");
		}

	}
	void checkBalance() {
		System.out.println("balance is "+balance);
	}
	void showdetails() {
		System.out.println("name is "+name);
		System.out.println("Bank name is "+bname);
		System.out.println("Account number is "+accno);
		System.out.println("Bank account type is "+type);
	}
}
