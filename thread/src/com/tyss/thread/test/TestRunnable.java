package com.tyss.thread.test;

public class TestRunnable {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread= new Thread(runnable);
		thread.start();
		for (int i = 0; i < 6; i++) {
			System.out.println("main method");
		}
	}
}
