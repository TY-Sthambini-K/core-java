package com.tyss.inheritance.test;

public class TestEngine {
public static void main(String[] args) {
	Tvs t = new Tvs();
	t.chasisNo=123456;
	t.color="Blue";
	t.name();
	Hero hro= new Hero();
	hro.chasisNo=2563;
	hro.color="black";
	hro.name();
	System.out.println(t.chasisNo);
	System.out.println(hro.color);
}
}
