package com.tyss.interfaceTest;

public abstract class NormalCalculator implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("addition");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("subtraction");
	}

	@Override
	public abstract void multiply();
		
	@Override
	public abstract void divide() ;

}
