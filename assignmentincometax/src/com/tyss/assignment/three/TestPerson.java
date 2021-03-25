package com.tyss.assignment.three;

public class TestPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sportsman sport=new Sportsman();
	sport.job();
	sport.pt_salary=5000;
	System.out.println(sport.pt_salary);
	Politician polit=new Politician();
	polit.work();
	polit.sp_salary=8000;
	System.out.println(polit.sp_salary);

	}

}