package com.tyss.filehandling.csv;

import java.io.*;
import java.util.Scanner;

public class CsvReader {
	public static void main(String[] args) {

		// parsing a CSV file into Scanner class constructor
		Scanner sc = null;
		try {
			sc = new Scanner(new File("E:\\java nots\\demo.csv"));
			sc.useDelimiter(","); // sets the delimiter pattern
			while (sc.hasNext()) // returns a boolean value
			{
				System.out.print(sc.next() + "\t"); // find and returns the next complete token from this scanner
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close(); // closes the scanner
		}

	}
}