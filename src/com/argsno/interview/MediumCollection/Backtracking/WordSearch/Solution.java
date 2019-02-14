package com.argsno.interview.MediumCollection.Backtracking.WordSearch;

public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (travel(board, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean travel(char[][] board, int bi, int bj, String word, int wi, boolean[][] visited) {
        if (wi == word.length()) return true;
        if (bi < 0 || bi >= board.length || bj < 0 || bj >= board[0].length || word.charAt(wi) != board[bi][bj] || visited[bi][bj]) {
            return false;
        }
        visited[bi][bj] = true;
        boolean r = travel(board, bi + 1, bj, word, wi + 1, visited)
                || travel(board, bi - 1, bj, word, wi + 1, visited)
                || travel(board, bi, bj + 1, word, wi + 1, visited)
                || travel(board, bi, bj - 1, word, wi + 1, visited);
        visited[bi][bj] = false;
        return r;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCCED"));
        System.out.println(solution.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "SEE"));
        System.out.println(solution.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCB"));
    }
}
