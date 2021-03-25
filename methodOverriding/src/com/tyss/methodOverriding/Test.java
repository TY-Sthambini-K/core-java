package com.tyss.methodOverriding;

public class Test {
public static void main(String[] args) {
//	Father father = new Father();
//	father.bike();
	Father f = new Son();
	f.bike();
}
}
