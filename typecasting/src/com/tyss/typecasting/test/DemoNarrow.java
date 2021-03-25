package com.tyss.typecasting.test;

public class DemoNarrow {
	public static void main(String[] args) {
	    double salary = 500;
	    byte myInt = (byte) salary; 
	    System.out.println(salary);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	  }
}
