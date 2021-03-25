package com.tyss.interfaceTest;

public class Employee implements Vehicle,Car{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("using");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("palying");
	}

}
