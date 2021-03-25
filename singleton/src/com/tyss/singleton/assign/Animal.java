package com.tyss.singleton.assign;

public class Animal {
public static Animal animal = null;
private Animal() {
	// TODO Auto-generated constructor stub
}
public static Animal getPlay() {
	if(animal==null) {
		animal = new Animal();
		return animal;
	}else {
		System.out.println("already created");
		return animal;
	}
}
}
