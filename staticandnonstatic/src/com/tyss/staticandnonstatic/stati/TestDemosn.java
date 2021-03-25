package com.tyss.staticandnonstatic.stati;

public class TestDemosn {
public static void main(String[] args) {
	System.out.println(Demosn.id);
	Demosn.learn();
	Demosn d=new Demosn();
	Demosn d1=new Demosn();
	d.work();
	d1.work();
	System.out.println(d.eid);
}
}
