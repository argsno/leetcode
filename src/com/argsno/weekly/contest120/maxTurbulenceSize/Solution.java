package com.argsno.weekly.contest120.maxTurbulenceSize;

public class Solution {
    public int maxTurbulenceSize(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return 1;
        }

        int max = 1;
        int cur = 1;
        int bigger = 0;
        for (int i = 1; i < A.length; i++) {
            if (bigger == 0) {
                if (A[i] != A[i - 1]) {
                    cur = 2;
                    if (cur > max) {
                        max = cur;
                    }
                    bigger = A[i] > A[i - 1] ? 1 : -1;
                } else {
                    cur = 1;
                    bigger = 0;
                }
            } else if (bigger == 1) {
                if (A[i] < A[i - 1]) {
                    cur++;
                    if (cur > max) {
                        max = cur;
                    }
                    bigger = -1;
                } else {
                    cur = 2;
                    bigger = A[i] > A[i - 1] ? 1 : 0;
                }
            } else {
                if (A[i] > A[i - 1]) {
                    cur++;
                    if (cur > max) {
                        max = cur;
                    }
                    bigger = 1;
                } else {
                    cur = 2;
                    bigger = A[i] < A[i - 1] ? -1 : 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxTurbulenceSize(new int[]{100}));
        System.out.println(solution.maxTurbulenceSize(new int[]{4, 8, 12, 16}));
        System.out.println(solution.maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9}));
        System.out.println(solution.maxTurbulenceSize(new int[]{9, 4, 4, 10, 7, 8, 8, 1, 9}));
    }
}
