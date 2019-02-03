package com.argsno.weekly.contest122.sumEvenAfterQueries985;

import java.util.Arrays;

public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        int[] res = new int[queries.length];
        for (int a : A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (A[queries[i][1]] % 2 == 0) {
                if (queries[i][0] % 2 == 0) {
                    sum += queries[i][0];
                } else {
                    sum -= A[queries[i][1]];
                }
            } else {
                if (queries[i][0] % 2 == 0) {
                } else {
                    sum += A[queries[i][1]];
                    sum += queries[i][0];
                }
            }
            res[i] = sum;
            A[queries[i][1]] += queries[i][0];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sumEvenAfterQueries(
                new int[]{1, 2, 3, 4},
                new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}}
        )));
    }
}
