package com.tyss.linkedhashset;

import java.util.TreeSet;

public class TestAlphabet {
public static void main(String[] args) {
	TreeSet<String> t = new TreeSet<String>();
	t.add("a");
	t.add("b");
	t.add("A");
	t.add("B");
	t.add("C");
	t.add("D");
	t.add("c");
	t.add("d");
	t.add("E");
	t.add("e");
	System.out.println(t);
}
}
