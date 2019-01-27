package com.argsno.weekly.contest120.sortedSquares;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        if (A == null) return null;
        int start = 0, end = A.length - 1;
        int[] res = new int[A.length];
        int resIndex = end;
        while (start <= end) {
            if (Math.abs(A[start]) < Math.abs(A[end])) {
                res[resIndex] = A[end] * A[end];
                end--;
            } else {
                res[resIndex] = A[start] * A[start];
                start++;
            }
            resIndex--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[] {-4,-1,0,3,10})));
        System.out.println(Arrays.toString(solution.sortedSquares(new int[] {-7,-3,2,3,11})));
        System.out.println(Arrays.toString(solution.sortedSquares(new int[] {})));
        System.out.println(Arrays.toString(solution.sortedSquares(null)));
    }
}
