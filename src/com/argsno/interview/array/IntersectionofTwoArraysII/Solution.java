package com.argsno.interview.array.IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (m.containsKey(nums1[i])) {
                m.put(nums1[i], m.get(nums1[i]) + 1);
            } else {
                m.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (m.containsKey(num) && m.get(num) > 0) {
                res.add(num);
                int c = m.get(num) - 1;
                m.put(num, c);
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
