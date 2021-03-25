package com.tyss.staticandnonstatic.stati;

public class Blockn {
 int id;
 {
	 id=123;
	 System.out.println("first block"+id);
 }
 {
	 System.out.println("second block");
 }
 {
	 System.out.println("third block");
 }
 
}
