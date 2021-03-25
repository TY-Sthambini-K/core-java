package com.tyss.constructor.test;

public class Employee {
int id;
String name;
String email;
public Employee(int id,String name,String email) {
	this.id=id;
	this.name=name;
	this.email=email;
}
public Employee(int id, String email) {
	this.id = id;
	this.email = email;
}
}
