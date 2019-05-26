package com.argsno.interview.EasyCollection.DynamicProgramming.ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = 1;
        int next = 2;
        int cur;
        while (n-- > 2) {
            cur = prev + next;
            prev = next;
            next = cur;
        }
        return next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(5));
    }
}
