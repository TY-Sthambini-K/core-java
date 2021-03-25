package com.tyss.thread.synchronize;

public class MyThread extends Thread{
int id;
String name;
Display d1;
public MyThread(int id, Display d1,String name) {
	super();
	this.id = id;
	this.d1 = d1;
	this.name = name;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	d1.wish(name);
}

}
