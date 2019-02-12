package com.argsno.interview.array.rotate;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        while (k-- > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] in1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(in1, 3);
        System.out.println(Arrays.toString(in1));
    }
}
