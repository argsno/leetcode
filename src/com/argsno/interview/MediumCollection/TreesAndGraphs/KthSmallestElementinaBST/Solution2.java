package com.argsno.interview.MediumCollection.TreesAndGraphs.KthSmallestElementinaBST;

import com.argsno.TreeNode;

public class Solution2 {
    int count;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if (node.left != null) dfs(node.left);
        count--;
        if (count == 0) {
            res = node.val;
            return;
        }
        if (node.right != null) dfs(node.right);
    }
}
