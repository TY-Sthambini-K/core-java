package com.tyss.collection.vector;

public class TestVectorList {
public static void main(String[] args) {
	MyVector l = new MyVector();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(70);
	l.add(80);
System.out.println("removed element"+l.remove(1));
	System.out.println(l.get(0));
	System.out.println(l);
}
}
