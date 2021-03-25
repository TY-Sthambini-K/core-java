package com.tyss.staticandnonstatic.stati;

public class Blocks {
	
	static int id;
static {
		id=14;
	System.out.println("this is a static block");
}
static {
	System.out.println("second static block");
}
static {
	System.out.println("third block");
}
static {
	System.out.println("forth block");
}
public static void main(String[] args) {
	System.out.println("main method" + id);
}
}
