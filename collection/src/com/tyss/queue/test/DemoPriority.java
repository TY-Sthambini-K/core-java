package com.tyss.queue.test;

import java.util.PriorityQueue;

public class DemoPriority {
	
		public static void main(String[] args) {
			PriorityQueue pq=new  PriorityQueue();
			pq.offer(56);
			pq.offer(9);	
			pq.offer(35);
			pq.offer(98);
			pq.offer(6);
			System.out.println(pq);
			System.out.println(pq.peek());
			System.out.println(pq.remove(6));
			System.out.println(pq);
			System.out.println(pq.poll());
			
		}

	}

