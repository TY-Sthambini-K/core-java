package com.tyss.typecasting.objassign;

public class TestPerson {
public static void main(String[] args) {
	Person person = new Employee(11, "saanvi");//upcasting we cant acess
	//subclass propertys
	person.write();
	Employee emp = (Employee) person;//downcasting we can acess superclass and
	//subclass propertys.
	emp.work();
	emp.write();
}
}
