package com.tyss.exception.test;

public class Person {
public static void doStuff() throws ArithmeticException{
	System.out.println("doing the first stuff");
	System.out.println(10/0);
//	doStuff2();
}
public static void doStuff1() throws ArithmeticException{
	doStuff();
	System.out.println("doing the second stuff");
	
}
public static void doStuff2() throws ArithmeticException {
	doStuff1();
	System.out.println("doing the third stuff");
	
}
}
