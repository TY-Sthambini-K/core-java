package com.tyss.exception.test;

public class Division {
public static void main(String[] args) {
	
	try {
		System.out.println("statement 1");
		System.out.println(10/0);
		System.out.println("statement 2");
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println("statement 3");
		System.out.println("invalid cant divde using 0 "+10/2);
		System.out.println("statement 4");
	}finally {
		System.out.println("finally block");
	}
}
}
