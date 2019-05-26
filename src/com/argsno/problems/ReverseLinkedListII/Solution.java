package com.argsno.problems.ReverseLinkedListII;

import com.argsno.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev, start, then;
        prev = dummy;
        for (int i = 0; i < m - 1; i++) prev = prev.next;
        start = prev.next;
        then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}
