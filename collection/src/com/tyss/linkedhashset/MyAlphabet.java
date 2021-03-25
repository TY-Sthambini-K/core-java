package com.tyss.linkedhashset;

import java.util.Comparator;

public class MyAlphabet implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.equals(o2)) {
			return +100;
		}else if(o2.equals(o1)) {
			return -100;
		}else {
			return 0;
		}
//		System.out.println("alphabet 1" +o1 +"alphabet 2"+ o2);
//		return o1.compareTo(o2);
		
	}
}
