package com.tyss.exception.test;

public class Demo {
	public static void main(String[] args) {
		try {
			int a[] = {10,20,30};
			System.out.println(a[2]);
try {
	System.out.println(a[7]);
}catch(Exception e) {
	System.out.println("an exception occured");
	
	try {
		System.out.println(a[8]);
	}catch(Exception er) {
		System.out.println("in catch block");
		System.exit(0);
	}
	
}
		} 
		//	try {
		//		System.out.println(a[7]);
		//	} we cant write multiple try blocks
//		catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			System.out.println("cant print");
////			e.printStackTrace();
//		}
		catch(ArithmeticException e ) {
			System.out.println("hi");
			e.toString();
		}
		catch(Exception e){
			System.out.println("hii");
			System.exit(0);
		}finally {
			System.out.println("finally block");
		}
	}
}
