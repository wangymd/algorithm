package com.algorithm.basic.datastructure2.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LinkedList:双向队列
 * @author win7
 *
 */
public class LinkedListTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		//添加元素(尾部)
		System.out.println(queue.add("data1"));
		System.out.println(queue.offer("data2"));
		System.out.println(queue.offer(null));
		System.out.println(queue);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		//获取元素(头部)
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		//删除元素(头部)
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
	}

}
