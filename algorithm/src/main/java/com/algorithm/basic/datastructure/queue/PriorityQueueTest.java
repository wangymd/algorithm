package com.algorithm.basic.datastructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue
 * 它的顺序是根据自然排序或者自定义 comparator 的
 * http://www.nowamagic.net/librarys/veda/detail/2350
 * @author win7
 *
 */
public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		System.out.println(queue.offer("data2"));
		System.out.println(queue.add("data1"));
//		System.out.println(queue.offer(null));//不可以放
		
		System.out.println(queue);
		
		queue.forEach(e ->{System.out.println(e);});
	}

}
