package com.tyss.singleton.assign;

public class Employee {
private static Employee employee=null;
public Employee() {
	// TODO Auto-generated constructor stub
}
public static Employee getValue(){
	if(employee==null) {
		employee = new Employee();
		return employee;
	}else {
		System.out.println("already exists");
		return employee;
	}
}
}
