package com.argsno.tag.backtracking.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            int candidate = candidates[i];
            if (cur + candidate > target) break;
            cur += candidate;
            temp.add(candidate);
            backtrack(candidates, target, cur, i, temp, res);
            temp.remove(temp.size() - 1);
            cur -= candidate;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
