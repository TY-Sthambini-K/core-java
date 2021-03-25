package com.tyss.abstaract.test;

public abstract class Sample extends Demo{

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("doing the stuff assigned");
	}
	public static void using() {
		System.out.println("using the application");
	}
	
	public abstract void doStuff1(); 

}
