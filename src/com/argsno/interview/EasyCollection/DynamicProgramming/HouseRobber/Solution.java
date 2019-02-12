package com.argsno.interview.EasyCollection.DynamicProgramming.HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int prev = nums[0];
        int next = Math.max(nums[0], nums[1]);
        int n = 2;
        int cur;
        while (n < nums.length) {
            cur = Math.max(nums[n] + prev, next);
            prev = next;
            next = cur;
            n++;
        }
        return next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{1, 2, 3, 1}));
        System.out.println(solution.rob(new int[]{2, 7, 9, 3, 1}));
    }
}
