package com.tyss.iterator.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Person {
	public static void main(String args[]){
	    ArrayList<String> names = new ArrayList<String>();
	    names.add("Sthambini");
	    names.add("Namratha");
	    names.add("Ruchitha");
	    names.add("saanvi");
	    names.add("sneha");
	 //
	    Iterator<String> itr = names.iterator();
	    itr.toString();
	    
	    while(itr.hasNext()) {
	      String obj = itr.next();
	      System.out.println(obj);
	    }
	 }
}
