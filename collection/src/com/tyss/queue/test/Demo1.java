package com.tyss.queue.test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo1 {
public static void main(String[] args) {
 LinkedBlockingQueue<Integer> lb=new  LinkedBlockingQueue();
 
 lb.offer(68);
 lb.offer(456);
 lb.offer(4);
 lb.offer(34);
 lb.offer(56);
 System.out.println(lb);
// System.out.println(lb.isEmpty());
// System.out.println(lb.peek());
// System.out.println(lb.removeAll(lb));
 System.out.println(lb);
 System.out.println(lb);
 System.out.println(lb.peek());
 System.out.println(lb.element());
 System.out.println(lb.remove(4));
 System.out.println(lb);
 System.out.println(lb.poll());
 System.out.println(lb);
}
}
