package com.tyss.variable.thisstat;

public class Sample {
public Sample() {
	this(25);
	System.out.println("default constructor");
}
public Sample(int x) {
	this(30, 25.5);
	System.out.println("one parameter constructor "+x);
}
public Sample(int a, double y) {
	
	System.out.println("two parameters constructor "+a +" "+y);
}
}
