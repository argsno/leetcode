package com.argsno.interview.EasyCollection.SortingAndSearching.MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n - 1;
        m--;
        n--;
        while (m >= 0 || n >= 0) {
            if (m == -1) {
                nums1[size] = nums2[n];
                size--;
                n--;
                continue;
            }
            if (n == -1) {
                return;
            }
            if (nums1[m] < nums2[n]) {
                nums1[size] = nums2[n];
                size--;
                n--;
            } else {
                nums1[size] = nums1[m];
                size--;
                m--;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] in1 = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(in1, 3, new int[]{2, 5, 6}, 2);
        System.out.println(Arrays.toString(in1));
    }
}
