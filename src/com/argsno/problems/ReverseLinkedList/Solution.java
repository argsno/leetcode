package com.argsno.problems.ReverseLinkedList;

import com.argsno.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev, cur, next;
        prev = null;
        cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
