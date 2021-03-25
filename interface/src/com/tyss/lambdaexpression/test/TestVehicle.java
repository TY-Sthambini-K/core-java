package com.tyss.lambdaexpression.test;

public class TestVehicle {
public static void main(String[] args) {
	Vehicle vehicle = new Vehicle() {
		
		@Override
		public void using() {
			// TODO Auto-generated method stub
			System.out.println("using the vehicle");
		}
	};
	Vehicle v = ()->{
		System.out.println("using lambda expression");
	};
	v.using();
	vehicle.using();
}
}
