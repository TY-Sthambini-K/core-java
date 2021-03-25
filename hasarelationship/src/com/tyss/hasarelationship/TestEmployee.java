package com.tyss.hasarelationship;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address(1088, "Rajajinagr", "bangalore", 560010);
Employee emp = new Employee(1,"sthambini", add);
emp.details();
System.out.println(emp.eid+" "+emp.name+" "+emp.address.doorno+" "+emp.address.area+" "+emp.address.city+" "+emp.address.pincode);
	}

}
