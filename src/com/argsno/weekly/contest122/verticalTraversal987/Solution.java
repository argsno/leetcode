package com.argsno.weekly.contest122.verticalTraversal987;

import com.argsno.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution {
    class Location implements Comparable<Location> {
        public int x, y, val;

        public Location(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Location that) {
            if (this.x != that.x) {
                return Integer.compare(this.x, that.x);
            }
            if (this.y != that.y) {
                return Integer.compare(this.y, that.y);
            }
            return Integer.compare(this.val, that.val);
        }
    }

    private List<Location> locations;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        locations = new ArrayList<>();
        dp(root, 0, 0);
        Collections.sort(locations);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int prev = locations.get(0).x;
        for (Location loc : locations) {
            if (loc.x != prev) {
                prev = loc.x;
                res.add(new ArrayList<>());
            }
            res.get(res.size() - 1).add(loc.val);
        }
        return res;
    }

    private void dp(TreeNode root, int x, int y) {
        if (root != null) {
            locations.add(new Location(x, y, root.val));
            dp(root.left, x - 1, y + 1);
            dp(root.right, x + 1, y + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        Solution solution1 = new Solution();
        List<List<Integer>> res1 = solution1.verticalTraversal(root1);
        System.out.println(res1);

        TreeNode root2 = new TreeNode(0,
                new TreeNode(5,
                        new TreeNode(9), null),
                new TreeNode(1,
                        new TreeNode(2, null,
                                new TreeNode(3,
                                        new TreeNode(4,
                                                new TreeNode(6, new TreeNode(7), null), null),
                                        new TreeNode(8))), null));
        System.out.println(solution1.verticalTraversal(root2));
    }
}
