package com.tyss.exception.test;

public class TestValidAge {

		public void validateAge(int age) throws ValidAge 
		{
			if(age<18) {
				throw new ValidAge("below 18");
			}else {
				System.out.println("eligible to vote");
			}
			 
	}
	}
	


