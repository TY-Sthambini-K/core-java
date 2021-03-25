package com.tyss.wrappers.test;

public class AutoTest {
public static void main(String[] args) {
	int x =10;
	float u =10.5f;
	boolean x1=true;
	char c= 'a';
	Integer i=5;//object type we can declare like this also
	Integer integer = new Integer(x);
	Float f = new Float(u);
	System.out.println(f);
	Boolean b1 = new Boolean(x1);
	int d = integer;
	System.out.println(d);//auto-unboxing
	String s = "100";
 int j = integer.parseInt(s);
 System.out.println(j);
 int o=25;
 String s2 = String.valueOf(o);
 System.out.println(s2);
	System.out.println(b1);
	System.out.println(integer);
}
}
