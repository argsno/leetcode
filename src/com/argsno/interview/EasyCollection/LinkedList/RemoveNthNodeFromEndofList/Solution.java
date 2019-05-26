package com.argsno.interview.EasyCollection.LinkedList.RemoveNthNodeFromEndofList;

import com.argsno.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 头节点
        ListNode start = new ListNode(0);
        start.next = head;

        ListNode right = start;
        ListNode left = start;
        while (n-- > 0) {
            right = right.next;
        }
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return start.next;
    }
}
