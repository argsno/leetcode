package com.argsno.interview.array.removeDuplicates;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 1, right = 1;
        while (right < nums.length) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
                right++;
            } else {
                right++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] in1 = new int[]{1, 1, 2};
        System.out.println(solution.removeDuplicates(in1));
        System.out.println(Arrays.toString(in1));
    }
}
