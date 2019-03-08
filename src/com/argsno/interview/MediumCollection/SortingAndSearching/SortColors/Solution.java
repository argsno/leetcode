package com.argsno.interview.MediumCollection.SortingAndSearching.SortColors;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < nums.length; i++) {
            int j;
            for (j = 0; j < count.length; j++) {
                if (count[j] > 0) break;
            }
            count[j]--;
            nums[i] = j;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] in = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(in);
        System.out.println(Arrays.toString(in));
    }
}
