package com.tyss.hasarelationship;
public class TestStudent {
public static void main(String[] args) {
	StudentDetails details = new StudentDetails(22,"bangalore", 75);
	Student student = new Student(11,"sthambini", details);
	System.out.println(student.id+" "+student.name+" "+student.detail.age+" "+student.detail.marks+" "+student.detail.place);
}
}

