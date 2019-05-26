package com.argsno.problems.LinkedListCycleII;

import com.argsno.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> m = new HashSet<>();
        while (head != null) {
            if (m.contains(head)) return head;
            m.add(head);
            head = head.next;
        }
        return null;
    }
}
