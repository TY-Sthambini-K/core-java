package com.tyss.collection.arraylist;

import java.util.ArrayList;

public class Generics {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(10);
	a.add(null);
	a.add(25);
//	a.add("sam"); cant be written because we have limited it for on;y integer
	System.out.println(a);
}
}

