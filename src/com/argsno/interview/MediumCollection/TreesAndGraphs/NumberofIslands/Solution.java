package com.argsno.interview.MediumCollection.TreesAndGraphs.NumberofIslands;

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void numIslands(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        numIslands(grid, i - 1, j);
        numIslands(grid, i + 1, j);
        numIslands(grid, i, j - 1);
        numIslands(grid, i, j + 1);
    }
}
