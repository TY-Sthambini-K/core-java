package com.tyss.functional.interfaces;

public class TestFather {
public static void main(String[] args) {
	Father f = new Father() {

		@Override
		public void working() {
			// TODO Auto-generated method stub
			System.out.println("working");
		}
	};
	f.working();
};
}
