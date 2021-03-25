package com.tyss.myproperties.test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileWriter {
public static void main(String[] args) throws Exception{
	
		FileOutputStream file = new FileOutputStream("prop3.properties");
		Properties pro = new Properties();
		pro.setProperty("name", "sam");
		pro.setProperty("email", "sam@gmail.com");
		pro.store(file, "hi");
		System.out.println("propertys file is created");
	
}
}
