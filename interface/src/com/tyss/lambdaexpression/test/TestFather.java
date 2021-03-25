package com.tyss.lambdaexpression.test;

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
	Father father = () -> {
		System.out.println("hi");
	};
	father.working();
}

}
