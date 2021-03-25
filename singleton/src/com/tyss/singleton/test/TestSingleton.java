package com.tyss.singleton.test;

public class TestSingleton {
public static void main(String[] args) {
	Singleton s1 =Singleton.getInstance();
	s1.getInstance();
	s1.getInstance();
	Singleton s2=s1;
			System.out.println(s1==s2);
	
}
}
