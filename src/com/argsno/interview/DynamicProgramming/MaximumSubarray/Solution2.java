package com.argsno.interview.DynamicProgramming.MaximumSubarray;

public class Solution2 {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }

    public int maxSubArray(int[] nums, int start, int end) {
        if (start >= end) {
            return nums[start];
        }
        int middle = start + (end - start) / 2;
        int subLeft = 0;
        int subLeftMax = 0;
        for (int i = middle - 1; i >= start; i--) {
            subLeft += nums[i];
            if (subLeft > subLeftMax) {
                subLeftMax = subLeft;
            }
        }
        int subRight = 0;
        int subRightMax = 0;
        for (int i = middle + 1; i <= end; i++) {
            subRight += nums[i];
            if (subRight > subRightMax) {
                subRightMax = subRight;
            }
        }
        return Math.max(subLeftMax + nums[middle] + subRightMax,
                Math.max(maxSubArray(nums, start, middle - 1), maxSubArray(nums, middle + 1, end)));
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSubArray(new int[]{Integer.MIN_VALUE}));
    }
}
