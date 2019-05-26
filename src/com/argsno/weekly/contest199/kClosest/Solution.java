package com.argsno.weekly.contest199.kClosest;

import java.util.*;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][];
        Map<Integer, List<int[]>> m = new HashMap<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(K);
        for (int[] point : points) {
            int r = point[0] * point[0] + point[1] * point[1];
            priorityQueue.add(r);
            if (m.containsKey(r)) {
                m.get(r).add(point);
            } else {
                List<int[]> l = new ArrayList<>();
                l.add(point);
                m.put(r, l);
            }
        }

        while (true) {
            int i = priorityQueue.poll();
            if (K > m.get(i).size()) {
                for (int j = 0; j < m.get(i).size(); j++) {
                    K--;
                    res[K] = m.get(i).get(j);
                }
            } else {
                for (int j = 0; j < K; j++) {
                    K--;
                    res[K] = m.get(i).get(j);
                    if (K <= 0) {
                        return res;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input1 = {{1, 3}, {-2, 2}, {2, -2}};
        int[][] input2 = {{3, 3}, {5, -1}, {-2, 4}};
        System.out.println(Arrays.deepToString(solution.kClosest(input1, 1)));
        System.out.println(Arrays.deepToString(solution.kClosest(input2, 2)));
    }
}
