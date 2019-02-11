package com.argsno.interview.Trees.MaximumDepthofBinaryTree;

import com.argsno.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 1);
    }

    private int dfs(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth;
        }
        int left = -1;
        if (root.left != null) {
            left = dfs(root.left, depth + 1);
        }
        int right = -1;
        if (root.right != null) {
            right = dfs(root.right, depth + 1);
        }
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20,
                new TreeNode(15), new TreeNode(7)));
        System.out.println(solution.maxDepth(root1));
    }
}
