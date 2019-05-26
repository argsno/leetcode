package com.argsno.problems.SwapNodesinPairs;

import com.argsno.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(0);
        ListNode pprev = newHead;
        ListNode prev = head;
        ListNode cur = prev.next;
        while (prev != null && cur != null) {
            prev.next = cur.next;
            cur.next = prev;
            pprev.next = cur;
            pprev = prev;
            prev = prev.next;
            if (prev != null)
                cur = prev.next;
            else
                cur = null;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        Solution solution = new Solution();
        ListNode res = solution.swapPairs(h1);
    }
}
