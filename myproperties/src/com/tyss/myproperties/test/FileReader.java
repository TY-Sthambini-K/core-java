package com.tyss.myproperties.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class FileReader {
public static void main(String[] args) throws Exception {
 FileInputStream input = new FileInputStream("myproperty2.properties");
 Properties pro = new Properties();
 pro.load(input);
 String name = (String) pro.get("name");
 String salary = (String) pro.get("salary");
 System.out.println("name=" + name+"salary is" +salary);
}
}
