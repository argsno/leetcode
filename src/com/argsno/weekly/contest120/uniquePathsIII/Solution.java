package com.argsno.weekly.contest120.uniquePathsIII;

/**
 * url: https://leetcode-cn.com/contest/weekly-contest-120/problems/unique-paths-iii/
 */
public class Solution {
    int directionX[] = {1, 0, -1, 0};
    int directionY[] = {0, 1, 0, -1};
    private int startX, startY;
    private int endX, endY;
    int sizeX, sizeY;
    int count0 = 0;
    int[][] grid;
    int[][] visited;

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        sizeX = grid.length;
        sizeY = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    count0++;
                }
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
                if (grid[i][j] == 2) {
                    endX = i;
                    endY = j;
                }
            }
        }
        count0 += 1;
        visited = new int[sizeX][sizeY];
        visited[startX][startY] = 1;
        return dfs(startX, startY, 0);
    }

    public int dfs(int curX, int curY, int count) {
        int res = 0;
        for (int i = 0; i < 4; i++) {
            int nextX = curX + directionX[i];
            int nextY = curY + directionY[i];
            if (nextX >= 0 && nextX < sizeX && nextY >= 0 && nextY < sizeY
                    && grid[nextX][nextY] != -1 && visited[nextX][nextY] == 0) {
                visited[nextX][nextY] = 1;
                count++;
                if (count == count0 && grid[nextX][nextY] == 2) {
                    res += 1;
                } else {
                    res += dfs(nextX, nextY, count);
                }
                count--;
                visited[nextX][nextY] = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution();
        System.out.println(solution1.uniquePathsIII(new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        }));
        Solution solution2 = new Solution();
        System.out.println(solution2.uniquePathsIII(new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 2}
        }));
        Solution solution3 = new Solution();
        System.out.println(solution3.uniquePathsIII(new int[][]{
                {1, 0},
                {0, 2,}
        }));
    }
}
