package com.tyss.thread.synchronize;

public class TestThread {
public static void main(String[] args) {
	Display d = new Display();
	MyThread thread = new MyThread(11, d, "hi");
	MyThread thread1 = new MyThread(11, d, "hello");
	thread.start();
	thread1.start();
}
}
