package com.tyss.exception.test;

public class TestPerson {
public static void main(String[] args) {
try {
	Person.doStuff2();
} catch (ArithmeticException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();
	System.out.println("handled");
}
}
}
