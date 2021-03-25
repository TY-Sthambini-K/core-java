package com.tyss.thread.test;

public class TestThread3 {
public static void main(String[] args) throws InterruptedException {
	Thread3 thread = new Thread3();
	System.out.println("main thread priority "+Thread2.currentThread().getPriority());
	thread.join();
//	thread.join(1500);
	thread.setPriority(10);
	thread.start();
	System.out.println("main thread priority "+thread.getPriority());
	for(int i=0;i<5;i++) {
		System.out.println("main thread");
	}
}
}
