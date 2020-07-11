package com.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 *
 */
class LinkedNumAdd {
	
	static class SingleLinkedList{
		Integer data;
		SingleLinkedList next;
		
		public SingleLinkedList() {}
		
		public SingleLinkedList(Integer data,SingleLinkedList next) {
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList l1_3 = new SingleLinkedList(3,null);
		SingleLinkedList l1_4 = new SingleLinkedList(4,l1_3);
		SingleLinkedList l1 = new SingleLinkedList(2,l1_4);
		
		SingleLinkedList l2_4 = new SingleLinkedList(4,null);
		SingleLinkedList l2_6 = new SingleLinkedList(6,l2_4);
		SingleLinkedList l2 = new SingleLinkedList(5,l2_6);

		System.out.println(addTwoNumbers(l1, l2));
	}

	public static SingleLinkedList addTwoNumbers(SingleLinkedList l1, SingleLinkedList l2) {
		SingleLinkedList head = new SingleLinkedList();//作为头结点
		
		int carry = 0;
		
		SingleLinkedList p1 = l1,p2 = l2,cur = head;//临时遍历
		
		while(p1 != null || p2 != null) {
			int x = p1 != null ? p1.data : 0;
			int y = p2 != null ? p2.data : 0;
			
			int sum = carry + x + y;
			carry = sum / 10; //溢出,进位
			cur.next = new SingleLinkedList(sum % 10, null);
			
			cur = cur.next;
			
			if(p1 != null) p1 = p1.next;
			if(p2 != null) p2 = p2.next;
			
//			if(carry > 0) {
//				cur.next= new SingleLinkedList(carry, null);
//			}
		}
		
		return head.next;
	}
}