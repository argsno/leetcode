package com.argsno.interview.EasyCollection.array.singleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int or = 0;
        for (int i = 0; i < nums.length; i++) {
            or ^= nums[i];
        }
        return or;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{2, 2, 1}));
    }
}
