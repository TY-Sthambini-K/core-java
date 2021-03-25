package com.tyss.set.hashset;

import java.util.HashSet;

public class Demo1 {
public static void main(String[] args) {
	HashSet<Integer> h = new HashSet<Integer>();
	h.add(25);
	h.add(15);
	h.add(25);//duplicte values are not allowed
	h.add(15);
	h.add(25);
	h.add(15);
	h.add(null);
	h.add(null);//only one null value can be stored
	System.out.println(h.contains(15));
	System.out.println(h.remove(15));
	System.out.println(h);
}
}
