package com.argsno.interview.EasyCollection.Trees.ValidateBinarySearchTree;

import com.argsno.TreeNode;

public class Solution {
    long max = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = true;
        boolean right = true;
        if (root.left != null) {
            left = isValidBST(root.left);
        }
        if (root.val <= max) {
            return false;
        }
        max = root.val;
        if (root.right != null) {
            right = isValidBST(root.right);
        }
        return left && right;
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution();
        TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20,
                new TreeNode(15), new TreeNode(7)));
        System.out.println(solution1.isValidBST(root1));
        Solution solution2 = new Solution();
        TreeNode root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(solution2.isValidBST(root2));
        Solution solution3 = new Solution();
        TreeNode root3 = new TreeNode(1, new TreeNode(1), null);
        System.out.println(solution3.isValidBST(root3));
        Solution solution4 = new Solution();
        TreeNode root4 = new TreeNode(-2147483648, null, null);
        System.out.println(solution4.isValidBST(root4));

    }
}
