package com.tyss.inheritance.test;

public class Test {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.pid=12;
	employee.name="sthambu";
	employee.email="sthambu@gmail.com";
	System.out.println(employee.pid);//person
	employee.address();
	employee.designation();//employee
			
}
}
