package com.tyss.linkedhashset;

import java.util.LinkedHashSet;

public class Demo1 {
public static void main(String[] args) {
	LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
	l.add(null);
	l.add(10);
	l.add(25);
	l.add(10);
	System.out.println(l);
	System.out.println(l.contains(10));
	System.out.println(l.remove(15));
	System.out.println(l.add(10));
}
}
