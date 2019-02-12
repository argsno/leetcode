package com.argsno.interview.array.maxProfit;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int[] diff = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            diff[i] = prices[i + 1] - prices[i];
        }
        int sum = 0;
        for (int i : diff) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{}));
        System.out.println(solution.maxProfit(new int[]{1}));
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
