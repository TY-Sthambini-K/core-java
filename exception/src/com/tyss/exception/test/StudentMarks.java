package com.tyss.exception.test;

public class StudentMarks {
public void studentsMarks(int marks) throws Student{
	if(marks<45) {
		throw new Student("not passed");
	}else {
		System.out.println("cleared");
	}
}
}

	 