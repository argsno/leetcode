package com.argsno.tag.backtracking.CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int cur, int start, List<Integer> temp, List<List<Integer>> res) {
        if (target == cur) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] + cur > target) break;
            cur += candidates[i];
            temp.add(candidates[i]);
            backtrack(candidates, target, cur, i + 1, temp, res);
            temp.remove(temp.size() - 1);
            cur -= candidates[i];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(new int[]{2, 2, 3, 6, 7}, 7));
        System.out.println(solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}
