package com.tyss.thread.synchronize;

public  class Display {
public synchronized void wish(String name) {
	for(int i =0; i<5;i++) {
		System.out.println("good afternoon");
		System.out.println(name);
	}
	try {
		Thread.sleep(5000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
