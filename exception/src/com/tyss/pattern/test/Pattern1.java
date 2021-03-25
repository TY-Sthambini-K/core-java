package com.tyss.pattern.test;

public class Pattern1 {
public static void main(String[] args) {
	
//	
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	
	}
	System.out.println("2nd program");
	//
	
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	System.out.println("3rd program");
	for(char i='a';i<='e';i++) {
		for(char j='a';j<=i;j++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
	System.out.println("4th program");
	for(char i='a';i<='e';i++) {
		for(char j='a';j<=i;j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
	System.out.println("5th program");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
	System.out.println("6th program");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
	System.out.println("7th program");
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(i==0||i==4||j==0||j==4) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println(" ");
	}
	}
}
