package com.tyss.singleton.assign;

public class TestAnimal {
public static void main(String[] args) {
	Animal a = Animal.getPlay();
	a.getPlay();
	Animal a1=a;
	System.out.println(a1==a);
}
}
