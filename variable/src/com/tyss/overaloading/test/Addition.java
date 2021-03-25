package com.tyss.overaloading.test;

public class Addition {
public int add(byte x, byte y) {
	System.out.println("addition of the numbers are "+(x+y));
	return x+y;
}
public void add(int a, int b) {
	System.out.println("addition of the numbers are "+(a+b));
}
public void add(double c, double d) {
	System.out.println("addition of the numbers are "+(c+d));
}
}
