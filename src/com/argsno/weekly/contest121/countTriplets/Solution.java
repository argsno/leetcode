package com.argsno.weekly.contest121.countTriplets;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countTriplets(int[] A) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i1 : A) {
            for (int i2 : A) {
                int r = i1 & i2;
                if (m.containsKey(r)) {
                    m.put(r, m.get(r) + 1);
                } else {
                    m.put(r, 1);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            for (int i : A) {
                if ((entry.getKey() & i) == 0) {
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
