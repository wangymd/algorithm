package com.algorithm.basic.datastructure.list;

import java.util.Stack;

/**
 * Stack
 * @author win7
 *
 */
public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		//添加元素
		stack.add("aaa");
		stack.add("bbb");
		stack.add("ccc");
		stack.add("111");
		stack.add("222");
		stack.add("000");
		stack.add("333");
		
		stack.push("abc");
		stack.push("abc");
		System.out.println(stack);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		for (String item : stack) {
			System.out.println(item);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		stack.forEach(item -> {System.out.println(item);});
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
	}

}
