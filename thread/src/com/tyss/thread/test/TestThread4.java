package com.tyss.thread.test;

public class TestThread4 {
public static void main(String[] args) throws InterruptedException {
	Thread4 thread = new Thread4();
	System.out.print('a');
	Thread.sleep(3000);
	System.out.print('b');
	Thread.sleep(3000);
	System.out.print('c');
	
}
}
