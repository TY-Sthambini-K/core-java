package com.tyss.thread.test;

public class Thread2 extends Thread {
	@Override
	public void run() {
		Thread.yield();
		for(int i =0; i<10; i++) {
			System.out.println("child thread");
		}
	}
}
