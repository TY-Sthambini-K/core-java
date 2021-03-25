package com.tyss.exception.test;

public class TestAge {
public static void main(String[] args) throws ValidAge  {
	TestValidAge age = new TestValidAge();
	age.validateAge(25);
}
}
