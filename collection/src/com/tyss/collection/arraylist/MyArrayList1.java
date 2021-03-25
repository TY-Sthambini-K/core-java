package com.tyss.collection.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList1<E> implements Iterable<E>{

		 private int size=0;
		  private Object eledata[]= {};
		  private final int DEFAULT_SIZE = 6;
	public MyArrayList1() {
		// TODO Auto-generated constructor stub
		this.eledata = new Object[DEFAULT_SIZE];
	}

		public void grow(Object e1) {
			System.out.println("inside add method");
			if(size==eledata.length) {
				System.out.println("inside if block");
				System.out.println("size is "+size);
				int prevSize = eledata.length;
				System.out.println("previous size"+prevSize);
				int newSize = prevSize*3;
				System.out.println("new size"+newSize);
				eledata = Arrays.copyOf(eledata, newSize);
			}
			this.eledata[size]=e1;
			size++;
			
		}

		@Override
		public String toString() {
			String s1 = new String("[");
			for(int i=0;i<size;i++) {
				if(i==size-1) {
					s1 = s1 + eledata[i];
				}else {
					s1 = s1+eledata[i]+",";
				}
			}
			s1=s1+"]";
			return s1;
		}

//		public String toString() 
//	    {
//	         StringBuilder sb = new StringBuilder();
//	         sb.append('[');
//	         for(int i = 0; i < size ;i++) {
//	             sb.append(eledata[i].toString());
//	             if(i<size-1){
//	                 sb.append(",");
//	             }
//	         }
//	         sb.append(']');
//	         return sb.toString();
//	    }
		 //Remove method

		//remove method
		 public Object remove(int index) {
			    if ( index <0 || index>= size) {  
			      throw new ArrayIndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
			    }
			   
			    Object removedElement=eledata[index];
			    for(int i=index;i<size - 1;i++){
			    	eledata[i]=eledata[i+1];
			    }
			    size--;   
			    return removedElement;
			  }
	      
	     
	    //Get Size of list
		 public Object get(int index) {
	         // if index is negative or greater than size of size, we throw
	         // Exception.
	         if (index < 0 || index >= size) {
	                 new ArrayIndexOutOfBoundsException("Index: " + index + ", Size "
	                             + index);
	         }
	         return (Object) eledata[index]; // return value on index.
	  }
		 public void display() {
	         System.out.print("Displaying list : ");
	         for (int i = 0; i < size; i++) {
	                System.out.println(eledata[i] + " ");
	         }
	  }
		 //ForEach
		 public void forEach(Object obj  ) {
//			 for(Object o:eledata) {
//				 System.out.println(o);
//			 }
			 for(int i=0;i<size;i++) {
				 obj = eledata[i];
				 System.out.println(obj);
			 }}
			 @Override
			 public Iterator <E> iterator() {
			 	// TODO Auto-generated method stub
			 	return new Itr();
			 }
		 
		 
 private class Itr implements Iterator<E>{
	 private int index;
	 @Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return(index < size)? true : false;
		}
	@Override
	public E next() {
		// TODO Auto-generated method stub
		E e =(E) eledata[index];
		index++;
		return e;
	}
	
	
 }
 }
	
	
	
 


