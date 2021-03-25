package com.tyss.propertysfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("demo1.properties");
	Properties pro = new Properties();
	pro.setProperty("name", "sam");
	pro.setProperty("age","22");
	pro.store(file, "hi");
	System.out.println("written");
}
}
