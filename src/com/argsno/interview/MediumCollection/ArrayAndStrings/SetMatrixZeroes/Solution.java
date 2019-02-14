package com.argsno.interview.MediumCollection.ArrayAndStrings.SetMatrixZeroes;

import java.util.Arrays;

public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row0 = new boolean[matrix.length];
        boolean[] col0 = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row0[i] = true;
                    col0[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (row0[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (col0[j]) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] in1 = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        solution.setZeroes(in1);
        System.out.println(Arrays.deepToString(in1));
    }
}
