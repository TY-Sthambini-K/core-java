package com.tyss.singleton.assign;

public class TestPerson {
public static void main(String[] args) {
	Person p = Person.getInstance();
	 p.getInstance();
	 p.getInstance();
	 Person p1 =p;
	 System.out.println(p1==p);
}
}
