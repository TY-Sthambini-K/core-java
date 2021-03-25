package com.tyss.exception.test;

public class Fibonacci {
public static void main(String[] args) {
	int a1=0;
	int a2=1;
	int a3;
	int n=10;
	for(int i=1;i<n;++i) {
		a3=a1+a2;
		a1=a2;
		a2=a3;
		
		System.out.println(a3);
		
	}
}
}
