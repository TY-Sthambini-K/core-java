package com.tyss.linkedhashset;

import java.util.TreeSet;

public class TestPerson {
public static <E> void main(String[] args) {
	TreeSet<Integer> t = new TreeSet<Integer>(new Person());
	t.add(25);
	t.add(56);
	t.add(45);
	System.out.println(t);
}
}
