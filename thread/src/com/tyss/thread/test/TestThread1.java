package com.tyss.thread.test;



public class TestThread1 {
public static void main(String[] args) {
	Thread1.currentThread().setPriority(3);
	System.out.println("Main thread priority "+Thread1.currentThread().getPriority());
	Thread1 thread = new Thread1();
	thread.setPriority(7);
	System.out.println("is deamon before " +thread.isDaemon());
	thread.setDaemon(true);
	thread.isInterrupted();
	System.out.println("is deamon " +thread.isDaemon());
	thread.start();
	System.out.println("is deamon " +thread.isDaemon());
	
//	thread.start();
	
	thread.setName("sam");
	
	System.out.println("my thread priority "+thread.getPriority());
	System.out.println("Name" +thread.getName());
	System.out.println("Priority" + thread.getPriority());
	System.out.println("ID "+thread.getId());
	for(int i =0;i<6;i++) {
		System.out.println("Main thread");
	}
//	thread.run();
//	thread.run(25);
	
}
}
