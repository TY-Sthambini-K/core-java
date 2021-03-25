package com.tyss.inheritance.test;

public class TestCalci {
public static void main(String[] args) {
//	ScientificCalci calcii = new ScientificCalci();
	SpaceCalculator calcii = new SpaceCalculator();
	calcii.add(15, 25);
	calcii.divide(25, 5);
	calcii.multiply(80, 20);
	calcii.square(25);
	calcii.mod(25, 3);
	calcii.sub(25, 10);
}
}
