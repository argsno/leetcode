package com.argsno.interview.MediumCollection.TreesAndGraphs.ConstructBinaryTreefromPreorderandInorderTraversal;

import com.argsno.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int ps, int[] inorder, int is, int ie) {
        if (ps > preorder.length - 1) return null;
        if (is > ie) return null;
        int v = preorder[ps];
        int index;
        for (index = is; index <= ie; index++) {
            if (inorder[index] == v) break;
        }
        TreeNode node = new TreeNode(v);
        node.left = buildTree(preorder, ps+1, inorder, is, index - 1);
        node.right = buildTree(preorder, ps+1+index-is, inorder, index+1, ie);
        return node;
    }
}
