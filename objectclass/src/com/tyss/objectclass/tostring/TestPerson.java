package com.tyss.objectclass.tostring;

public class TestPerson {
	public static void main(String[] args) {
		Person p =new Person(11, "sthambini", 22);
		System.out.println(p);
		System.out.println(p.toString());
		Person p2 = new Person(11, "sthambini", 22);
		boolean result =p.equals(p2);
		System.out.println(p2==p);
		System.out.println(result);
//		Person p1=p;
//		System.out.println(p1==p);
	}
}
