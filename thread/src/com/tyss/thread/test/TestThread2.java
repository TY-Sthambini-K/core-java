package com.tyss.thread.test;

public class TestThread2 {
public static void main(String[] args) {
	Thread2 thread = new Thread2();
	System.out.println("main thread priority "+Thread2.currentThread().getPriority());
	thread.setPriority(10);
	thread.start();
	System.out.println("main thread priority "+thread.getPriority());
	for(int i=0;i<5;i++) {
		System.out.println("main thread");
	}
}
}
