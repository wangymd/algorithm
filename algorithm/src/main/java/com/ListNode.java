package com;

public class ListNode {
	int data;
	ListNode next;
	
	ListNode() {}

	ListNode(int x) {
		data = x;
	}
	
	public int getVal() {
		return data;
	}

	public void setVal(int val) {
		this.data = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}