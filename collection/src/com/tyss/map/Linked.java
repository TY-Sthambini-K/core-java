package com.tyss.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linked {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
	l.put("sid",12);
	l.put("pid",22);
	l.put("eid",32);
	Set<String> s = l.keySet();
	Iterator itr =s.iterator();
	while(itr.hasNext()) {
		String s1 = (String) itr.next();
		System.out.println(s);
	}
	int i = l.get("sid");
	System.out.println(i);
	
}
}
