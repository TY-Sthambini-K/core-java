package com.tyss.filehandling.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvWriter {
	public static void main(String[] args) {

		try (PrintWriter writer = new PrintWriter(new File("E:\\java nots\\demo.csv"))) {

			StringBuilder sb = new StringBuilder();
			sb.append("id,");
			sb.append("Name");
			sb.append(',');			
			sb.append('\n');

			sb.append("1");
			sb.append(',');
			sb.append("Sthambini");
			sb.append('\n');
			
			sb.append("2");
			sb.append(',');
			sb.append("Namrata");
			sb.append('\n');
			
			sb.append("3");
			sb.append(',');
			sb.append("ruchitha");
			sb.append('\n');
			
			sb.append("4");
			sb.append(',');
			sb.append("Ramya");
			sb.append('\n');
			
			sb.append("5");
			sb.append(',');
			sb.append("saanvi");
			sb.append('\n');

			writer.write(sb.toString());

			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
