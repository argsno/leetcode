package com.argsno.interview.EasyCollection.Trees.ConvertSortedArraytoBinarySearchTree;

import com.argsno.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (end + start) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = build(nums, start, middle - 1);
        root.right = build(nums, middle + 1, end);
        return root;
    }
}
