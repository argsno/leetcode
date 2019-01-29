package com.argsno.weekly.contest121.mincostTickets;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] minCosts = new int[days[days.length - 1] + 1];
        Set<Integer> s = new HashSet<>();
        for (int day : days) {
            s.add(day);
        }
        for (int i = 1; i < minCosts.length; i++) {
            if (!s.contains(i)) {
                minCosts[i] = minCosts[i - 1];
                continue;
            }

            int minCost = minCosts[i - 1] + costs[0];
            minCost = Math.min(minCost, minCosts[Math.max(0, i - 7)] + costs[1]);
            minCost = Math.min(minCost, minCosts[Math.max(0, i - 30)] + costs[2]);
            minCosts[i] = minCost;
        }
        return minCosts[minCosts.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));
    }
}
