package com.tyss.singleton.test;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		
		if (singleton == null) {
			singleton=new Singleton();
			return singleton;
		} else {
			System.out.println("already exists");
			return singleton;
		}
	}
}
