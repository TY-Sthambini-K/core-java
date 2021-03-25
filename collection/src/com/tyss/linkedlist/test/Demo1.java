package com.tyss.linkedlist.test;

import java.util.LinkedList;

public class Demo1 {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(10);
	l.add(25);
	l.add(35);
	l.add(45);
	l.addFirst(15);
	l.addLast(563);
	System.out.println(l.getLast());
	System.out.println(l.getFirst());
	System.out.println(l.removeFirst());
	System.out.println(l.removeLast());
	System.out.println(l);
}
}
