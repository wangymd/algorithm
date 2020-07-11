package com.leetcode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 
 * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
 * 
 * @author win7
 *
 */
public class MergeTwoSortedList {

	static class SingleLinkedList {
		Integer data;
		SingleLinkedList next;

		public SingleLinkedList() {
		}

		public SingleLinkedList(Integer data, SingleLinkedList next) {
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList l1_3 = new SingleLinkedList(4, null);
		SingleLinkedList l1_4 = new SingleLinkedList(2, l1_3);
		SingleLinkedList l1 = new SingleLinkedList(1, l1_4);

		SingleLinkedList l2_4 = new SingleLinkedList(4, null);
		SingleLinkedList l2_6 = new SingleLinkedList(3, l2_4);
		SingleLinkedList l2 = new SingleLinkedList(1, l2_6);

		System.out.println(mergeTwoLists(l1, l2));
	}

	private static SingleLinkedList mergeTwoLists(SingleLinkedList l1, SingleLinkedList l2) {
		if(l1 == null) return l2;
		
		if(l2 == null) return l1;
		
		if(l1.data <= l2.data) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

}
