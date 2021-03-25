package com.tyss.pattern.test;

public class Armstrong {
public static void main(String[] args) {
	int n=256;
	int temp;
	int a;
	int c=0;
 temp = n;
 while(n>0) {
	 a=n%10;
	 n=n/10;
	 c=c+(a*a*a);
 }if(temp==c) {
	 System.out.println("armstrong number");
 }else {
	 System.out.println("not an armstrong number");
 }
}
}
