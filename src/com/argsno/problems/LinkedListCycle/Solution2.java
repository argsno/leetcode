package com.argsno.problems.LinkedListCycle;

import com.argsno.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> m = new HashSet<>();
        while (head != null) {
            if (m.contains(head)) return true;
            m.add(head);
            head = head.next;
        }
        return false;
    }
}
