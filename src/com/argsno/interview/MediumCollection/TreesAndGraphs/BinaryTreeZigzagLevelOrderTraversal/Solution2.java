package com.argsno.interview.MediumCollection.TreesAndGraphs.BinaryTreeZigzagLevelOrderTraversal;

import com.argsno.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        travel(root, res, 0);
        return res;
    }

    public void travel(TreeNode cur, List<List<Integer>> res, int level) {
        if (cur == null) return;
        if (res.size() <= level) {
            List<Integer> newLevel = new LinkedList<>();
            res.add(newLevel);
        }
        List<Integer> l = res.get(level);
        if (level % 2 == 0) l.add(cur.val);
        else l.add(0, cur.val);

        travel(cur.left, res, level + 1);
        travel(cur.right, res, level + 1);
    }
}
