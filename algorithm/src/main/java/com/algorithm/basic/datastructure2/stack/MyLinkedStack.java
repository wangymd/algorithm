package com.algorithm.basic.datastructure2.stack;

import java.io.Serializable;

/**
 * Created by zejian on 2016/11/27. Blog :
 * http://blog.csdn.net/javazejian/article/details/53362993 [原文地址,请尊重原创] 栈的链式实现
 */
public class MyLinkedStack<T> implements Stack<T>,Serializable {

	private static final long serialVersionUID = 1911829302658328353L;

	private static class Node<E> {

		E data;
//		Node<E> prev;
		Node<E> next;

		public Node() {
		}

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

	}

	private Node<T> top;

	private int size;

	public MyLinkedStack() {
		this.top = new Node<>();
	}

	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return top == null || top.data == null;
	}

	@Override
	public void push(T data) throws MyDefException{
		if (data == null) {
			throw new MyDefException("data can\'t be null");
		}
		if (this.top == null) {// 调用pop()后top可能为null
			this.top = new Node<>(data);
		} else if (this.top.data == null) {
			this.top.data = data;
		} else {
			Node<T> p = new Node<>(data, this.top);
			top = p;// 更新栈顶
		}
		size++;
	}

	@Override
	public T peek() throws MyDefException{
		if (isEmpty()) {
			throw new MyDefException("Stack empty");
		}
		return top.data;
	}

	@Override
	public T pop() throws MyDefException{
		if (isEmpty()) {
			throw new MyDefException("Stack empty");
		}

		T data = top.data;
		top = top.next;
		size--;
		return data;
	}

	// 测试
	public static void main(String[] args) throws MyDefException{
		MyLinkedStack<String> sl = new MyLinkedStack<>();
		sl.push("A");
		sl.push("B");
		sl.push("C");
		int length = sl.size();
		for (int i = 0; i < length; i++) {
			System.out.println("sl.pop->" + sl.pop());
		}
	}
}