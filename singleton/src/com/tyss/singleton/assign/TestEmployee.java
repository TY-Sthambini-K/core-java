package com.tyss.singleton.assign;

public class TestEmployee {
public static void main(String[] args) {
	Employee emp = Employee.getValue();
	emp.getValue();
	Employee emp1=emp;
	System.out.println(emp1==emp);
}
}
