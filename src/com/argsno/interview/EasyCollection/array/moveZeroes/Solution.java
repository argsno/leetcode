package com.argsno.interview.EasyCollection.array.moveZeroes;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right;
        while (left < nums.length) {
            if (nums[left] == 0) {
                break;
            }
            left++;
        }
        right = left + 1;
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] in1 = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(in1);
        System.out.println(Arrays.toString(in1));
        int[] in2 = new int[]{0};
        solution.moveZeroes(in2);
        System.out.println(Arrays.toString(in2));
    }
}
