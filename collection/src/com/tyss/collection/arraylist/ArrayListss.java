package com.tyss.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListss {
	public static void main(String[] args) {
//		ArrayList l = new ArrayList();
		List l= new ArrayList();
		
		l.add(10);
		l.add(25);
		l.add(10);
		System.out.println(l);
		//for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		//for each loop
		for(Object a : l) {
			System.out.println(a);
		}
		
		Iterator iterator = l.iterator();
		System.out.println(iterator.hasNext());
		while(iterator.hasNext()) {
			Integer lst = (Integer)iterator.next();
			
			System.out.println(lst);
//			System.out.println(iterator.next()+" hi");
		}
	}
}
