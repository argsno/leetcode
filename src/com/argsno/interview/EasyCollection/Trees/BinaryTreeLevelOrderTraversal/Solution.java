package com.argsno.interview.EasyCollection.Trees.BinaryTreeLevelOrderTraversal;

import com.argsno.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Queue<TreeNode> q2 = q;
            q = new LinkedList<>();
            List<Integer> temp = new ArrayList<>();

            while (!q2.isEmpty()) {
                TreeNode node = q2.poll();
                temp.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
