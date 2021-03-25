package com.tyss.assignmentincometax.test;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		acc.accno=123456789;
		acc.bname="S.B.I";
		acc.type="savings account";
		acc.name="sthambini";
		acc.balance=0;
		acc.withdraw(250);
		acc.showdetails();
		acc.checkBalance();
		acc.deposit(0);

	}

}
