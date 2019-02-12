package com.argsno.interview.EasyCollection.LinkedList.ReverseLinkedList;

import com.argsno.ListNode;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }

    public ListNode reverseList(ListNode cur, ListNode prev) {
        if (cur == null) {
            return prev;
        }
        ListNode next = cur.next;
        cur.next = prev;
        return reverseList(next, cur);
    }
}
