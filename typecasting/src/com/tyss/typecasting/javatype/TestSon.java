package com.tyss.typecasting.javatype;

public class TestSon {
	public static void main(String[] args) {
		Father father = new Son();//upcasting
		Son s = new Son();
		Father f =s; //upcasting
		f.work(); 
		f.use();//here son propertys cant be executed.
		father.work();
		//for downcasting upcasting is mandatory
		Son son =(Son)f;//here all the behaviours can be acessed 
		son.study();
		son.work();
	}
}
