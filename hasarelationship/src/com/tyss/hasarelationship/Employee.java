package com.tyss.hasarelationship;

public class Employee {
int eid;
String name;
Address address;
void details() {
	System.out.println("details are "+eid+" "+name);
}
public Employee(int eid, String name, Address address) {
	super();
	this.eid = eid;
	this.name = name;
	this.address = address;
}

}
