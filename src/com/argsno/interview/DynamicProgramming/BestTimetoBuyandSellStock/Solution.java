package com.argsno.interview.DynamicProgramming.BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] diff = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            diff[i - 1] = prices[i] - prices[i - 1];
        }
        return maxSubArray(diff);
    }

    private int maxSubArray(int[] arr) {
        int max = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            if (cur > max) {
                max = cur;
            }
            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
