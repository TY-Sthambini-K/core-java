package com.tyss.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoHashMap {
public static void main(String[] args) {
	HashMap<String, Integer> h = new HashMap<String, Integer>();
	h.put("sid", 12);
	h.put("sub1", 75);
	h.put("sub2", 52);
	System.out.println(h);
	
	for (Object obj : h.keySet()) {
		System.out.println(obj);
	}
	

	/*Set<String> s = h.keySet();
	Iterator<String> itr = s.iterator();
	while(itr.hasNext()) {
		String s1 = (String)itr.next();
		System.out.println(s1);
	}
	int id = h.get("sid");
	System.out.println(id);
}*/
}

}
