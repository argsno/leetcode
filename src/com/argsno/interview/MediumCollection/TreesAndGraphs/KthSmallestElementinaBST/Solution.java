package com.argsno.interview.MediumCollection.TreesAndGraphs.KthSmallestElementinaBST;

import com.argsno.TreeNode;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int count = countNode(root.left);
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k - count - 1);
        }
        return root.val;
    }

    private int countNode(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNode(node.left) + countNode(node.right);
    }
}
