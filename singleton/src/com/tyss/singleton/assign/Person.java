package com.tyss.singleton.assign;

public class Person {
private static Person person=null;
private Person() {
	// TODO Auto-generated constructor stub
}
public static Person getInstance() {
	if(person==null) {
		person = new Person();
		return person;
	}else {
		System.out.println("object already exists");
		return person;
	}
}
}
