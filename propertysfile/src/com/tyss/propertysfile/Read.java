package com.tyss.propertysfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read {
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("demo1.properties");
	Properties pro = new Properties();
	pro.load(file);
	String name = (String)pro.get("name");
	int age = (int)pro.get("age");
	System.out.println("name is "+name +"age is"+age);
}
}
