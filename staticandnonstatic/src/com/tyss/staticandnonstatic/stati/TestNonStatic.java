package com.tyss.staticandnonstatic.stati;

public class TestNonStatic {
public static void main(String[] args) {
	NonStatic n= new NonStatic();
	NonStatic n1= new NonStatic();
	n.id=112;
	System.out.println(n.id);
	System.out.println(n.name);
	n.learn();
	n1.learn();
}
}
