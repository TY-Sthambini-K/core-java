package com.tyss.linkedhashset;

import java.util.TreeSet;

public class MyTreeSet {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
//	t.add(null);
	t.add(15);
	t.add(25);
	t.add(35);
//	t.add("abc"); class cast exception
//	t.add(null);
//	t.add(15);
//	t.add(25);
//	t.add(35);
	System.out.println(t);
}
}
