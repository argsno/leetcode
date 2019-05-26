package com.argsno.interview.MediumCollection.TreesAndGraphs.PopulatingNextRightPointersinEachNode;

import com.argsno.TreeLinkNode;

public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode pre = root;
        TreeLinkNode cur;
        while (pre.left != null) {
            cur = pre;
            while (cur != null) {
                cur.left.next = cur.right;
                if (cur.next != null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            pre = pre.left;
        }
    }
}
