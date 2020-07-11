package com.leetcode;

/**
 * 
 * 输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 * 
 * @author win7
 *
 */
public class ReverseList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
		
//		ListNode reverseList = reverseList(l1);
		ListNode reverseList2 = reverseList2(l1);
		System.out.println();
	}

	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) return head;//最后一个节点
		
		ListNode rt = reverseList(head.next);
		head.next.next = head;
		head.next = null;//释放最后元素
		
		return rt;
	}
	
	public static ListNode reverseList2(ListNode head) {
		ListNode rt = null;
		ListNode cur = head;
		while(cur != null) {
			ListNode tmp = cur.next;//保存临时变量
			cur.next = rt;
			rt = cur;
			cur = tmp;//遍历下一个节点
		}
		return rt;
	}

}
