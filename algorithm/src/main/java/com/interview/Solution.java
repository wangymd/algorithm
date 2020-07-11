package com.interview;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 *
 */

class Solution {
	
	public static void main(String[] args) {
		ListNode l1_3 = new ListNode(3, null);
		ListNode l1_4 = new ListNode(4, l1_3);
		ListNode l1 = new ListNode(2, l1_4);

		ListNode l2_4 = new ListNode(4, null);
		ListNode l2_6 = new ListNode(6, l2_4);
		ListNode l2 = new ListNode(5, l2_6);
		
		System.out.println(mergeTwoLists(l1, l2));
	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.data < l2.data) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
    
    @Data
    @AllArgsConstructor
    static class ListNode {
    	int data;
    	ListNode next;
    }
}
