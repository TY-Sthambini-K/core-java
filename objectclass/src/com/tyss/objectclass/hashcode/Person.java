package com.tyss.objectclass.hashcode;

public class Person {
	int pid;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//	return 1000 improper code
		return pid;
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.pid=121;

		System.out.println(person.hashCode());
	}
}
