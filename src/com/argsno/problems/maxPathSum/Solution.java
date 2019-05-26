package com.argsno.problems.maxPathSum;

import com.argsno.TreeNode;

public class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dp(root);
        return max;
    }

    public int dp(TreeNode root) {
        if (root == null) return 0;
        int left = dp(root.left);
        int right = dp(root.right);
        left = Math.max(0, left);
        right = Math.max(0, right);

        max = Math.max(left + right + root.val, max);
        return Math.max(left, right) + root.val;
    }
}
