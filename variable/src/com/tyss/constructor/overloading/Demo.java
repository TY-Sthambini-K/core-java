package com.tyss.constructor.overloading;

public class Demo {

		 Demo() {
			System.out.println("default constructor");
		}
		 Demo(int x){
			System.out.println("single argument constructor "+ x);
		}
		 Demo(double y, int z){
			 System.out.println("double argument constructor "+ y + z);
		 }
		}

