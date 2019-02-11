package com.argsno.interview.array.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        Set<Integer> m = new HashSet<>();
        for (Integer i : nums) {
            if (m.contains(i)) {
                return true;
            }
            m.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3}));
    }
}
