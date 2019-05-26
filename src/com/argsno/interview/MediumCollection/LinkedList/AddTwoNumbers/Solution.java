package com.argsno.interview.MediumCollection.LinkedList.AddTwoNumbers;

import com.argsno.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l3 = new ListNode(0);
        ListNode ans = l3;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
            carry = sum / 10;
        }
        return ans.next;
    }
}
