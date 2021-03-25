package com.tyss.collection.arraylist;

import java.util.Iterator;

public class TestArrayList1  {
	public static void main(String[] args) {
		MyArrayList1 array = new MyArrayList1();
		array.grow(10);
		array.grow(40);
		array.grow(30);
		array.grow(20);
		array.grow(50);
		array.grow(60);
		array.grow(70);
		System.out.println("displaying using for each");
		array.forEach(array);
		System.out.println("Using Iterator");
		Iterator<Integer> itr = array.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		System.out.println(al);
//		

//		System.out.println(al);
	}
}
