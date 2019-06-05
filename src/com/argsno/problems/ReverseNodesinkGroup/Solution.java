package com.argsno.problems.ReverseNodesinkGroup;

import com.argsno.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int cnt = 0;
        ListNode cur = head;
        while (cur != null && cnt != k) {
            cur = cur.next;
            cnt++;
        }
        if (k == cnt) {
            ListNode next = reverseKGroup(cur, k);
            while (cnt-- > 0) {
                ListNode tmp = head.next;
                head.next = next;
                next = head;
                head = tmp;
            }
            return next;
        }
        return head;
    }
}
