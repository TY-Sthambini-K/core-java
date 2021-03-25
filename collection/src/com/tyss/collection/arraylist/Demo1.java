package com.tyss.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
public static void main(String[] args) {
	ArrayList <Integer>a =new ArrayList<Integer>();
	a.add(10);
//	a.add("sam");
	a.add(10);
	a.add(25);
//	a.add(null);
	a.add(10);
//	a.add("sam");
	a.add(10);
	a.add(25);
	a.add(10);
//	a.add("sam");
	a.add(10);
	a.add(25);
	
	System.out.println(a);
	for(Object o : a) {
		System.out.println(o);
	}
	Collections.sort(a);
	System.out.println(a);
	ArrayList al = new ArrayList();
	al.addAll(a);
	System.out.println(al.containsAll(a));
	System.out.println(a);
	System.out.println(a.size());;
	System.out.println(a.contains(25));
	System.out.println(a.isEmpty());
	System.out.println(a.get(2));
	
}
}
