package com.argsno.problems.SwapNodesinPairs;

import com.argsno.ListNode;

public class Solution2 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
