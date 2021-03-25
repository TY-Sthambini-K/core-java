package com.tyss.iterator.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=0;i<6;i++) {
		al.add(i);
	}
//	System.out.println(al);
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		int i =(Integer)itr.next();
		System.out.println(i);
		if(i%2!=0) {
			itr.remove();
			System.out.println(al);
		}
	}
}
}
