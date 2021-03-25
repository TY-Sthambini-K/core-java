package com.tyss.typecasting.objassign;

public class Employee extends Person{
int eid;
String ename;
public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
	
}
void work() {
	System.out.println("working");
	System.out.println(eid+" "+ename);
}

}
