package com.argsno.weekly.contest121.countTriplets;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countTriplets(int[] A) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                int r = A[i] & A[j];
                if (m.containsKey(r)) {
                    m.put(r, m.get(r) + 1);
                } else {
                    m.put(r, 1);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            for (int j = 0; j < A.length; j++) {
                if ((entry.getKey() & A[j]) == 0) {
                    res += entry.getValue();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countTriplets(new int[]{2, 1, 3}));
    }
}
