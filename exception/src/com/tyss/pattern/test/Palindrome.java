package com.tyss.pattern.test;

public class Palindrome {
public static void main(String[] args) {
	int n=121;
	int sum=0;
	int temp;
	temp=n;
	while(n>0) {
		int r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println("it is a palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
