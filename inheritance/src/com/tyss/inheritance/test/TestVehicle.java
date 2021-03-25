package com.tyss.inheritance.test;

public class TestVehicle {
public static void main(String[] args) {
	Cycle bike = new Bike();//parent class reference to child class
	bike.cost=1246;
	bike.move();
//	bike.start();
	System.out.println(bike.cost);
}
}
