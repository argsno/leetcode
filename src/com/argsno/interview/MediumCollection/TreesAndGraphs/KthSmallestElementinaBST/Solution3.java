package com.argsno.interview.MediumCollection.TreesAndGraphs.KthSmallestElementinaBST;

import com.argsno.TreeNode;

import java.util.Stack;

public class Solution3 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        while (k != 0) {
            TreeNode node = stack.pop();
            k--;
            if (k == 0) return node.val;
            TreeNode right = node.right;
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        return -1;
    }
}
