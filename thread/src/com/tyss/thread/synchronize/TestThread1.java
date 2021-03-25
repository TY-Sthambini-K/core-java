package com.tyss.thread.synchronize;

public class TestThread1 {
public static void main(String[] args) {
	Thread1 thread = new Thread1();
	Thread2 thread1 = new Thread2();
	
	thread.start();
	thread1.start();
}
}
