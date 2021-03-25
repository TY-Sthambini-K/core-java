package com.tyss.interfaceTest;

public interface Sample {
	int x=24;
public void using();
public void working();
 public default void writing() {
	 int x=25;
	 System.out.println("writing"+this.x);
//	 System.out.println("writing"+super.x);

 }
 static void learn() {
	 System.out.println("learning");
 }
}
