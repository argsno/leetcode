package com.argsno.interview.MediumCollection.TreesAndGraphs.BinaryTreeZigzagLevelOrderTraversal;

import com.argsno.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            Deque<TreeNode> queue2 = new LinkedList<>();
            List<Integer> l = new ArrayList<>();
            if (flag) {
                while (!queue.isEmpty()) {
                    TreeNode node = queue.removeLast();
                    l.add(node.val);
                    if (node.left != null) queue2.add(node.left);
                    if (node.right != null) queue2.add(node.right);
                }
                flag = false;
            } else {
                while (!queue.isEmpty()) {
                    TreeNode node = queue.removeLast();
                    l.add(node.val);
                    if (node.right != null) queue2.add(node.right);
                    if (node.left != null) queue2.add(node.left);
                }
                flag = true;
            }
            queue = queue2;
            res.add(l);
        }
        return res;
    }
}
