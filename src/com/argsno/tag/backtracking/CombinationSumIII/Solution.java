package com.argsno.tag.backtracking.CombinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int[] NUMS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(k, n, 0, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int k, int n, int cur, int start, List<Integer> temp, List<List<Integer>> res) {
        if (cur > n || temp.size() > k) return;
        if (temp.size() == k && n == cur) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < NUMS.length; i++) {
            cur += NUMS[i];
            temp.add(NUMS[i]);
            backtrack(k, n, cur, i+1, temp, res);
            temp.remove(temp.size() - 1);
            cur -= NUMS[i];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum3(3, 7));
    }
}
