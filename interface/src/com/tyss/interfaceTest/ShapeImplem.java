package com.tyss.interfaceTest;

public class ShapeImplem {
public static void main(String[] args) {
//	Shape s = new Shape() {
//
//		@Override
//		public void drawing() {
//			// TODO Auto-generated method stub
//			System.out.println("i am drawing");
//		}
//		};
	Shape s = () ->{
		System.out.println("Drawing");
	};
		s.drawing();
}
}
