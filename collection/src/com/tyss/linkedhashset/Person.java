package com.tyss.linkedhashset;

import java.util.Comparator;

public class Person implements Comparator<Integer>{
@Override
public int compare(Integer o1,Integer  o2) {
//	Integer i1 = (Integer) o1;
//	Integer i2 =(Integer) o2;
	if(o1<o2)
		return +100;
	else if (o1>o2) 
		return -100;
	else 
	return 0;
}
}
