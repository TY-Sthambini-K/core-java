package com.tyss.constructor.test;

public class TestEmployee {
public static void main(String[] args) {
//	Employee e1= new Employee();
//	e1.id=12;
//	e1.name="sthambu";
//	e1.email="sthambini@gmail.com";
//	System.out.println(e1.id);
//	System.out.println(e1.name);
//	System.out.println(e1.email);
//	Employee e2= new Employee();
//	System.out.println(e2.id);
//	System.out.println(e2.name);
//	System.out.println(e2.email);
	Employee e1 = new Employee(10,"sthambu", "sthambu@gmail.com");
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.email);
	System.out.println("===========================");
	Employee e2 = new Employee(11,"namrata", "namrata@gmail.com");
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.email);
}
}
