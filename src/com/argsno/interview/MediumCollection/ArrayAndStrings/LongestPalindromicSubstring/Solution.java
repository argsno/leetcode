package com.argsno.interview.MediumCollection.ArrayAndStrings.LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1]);

                if (dp[i][j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }

//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i; j < n; j++) {
//                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1]);
//
//                if (dp[i][j] && j - i + 1 > res.length()) {
//                    res = s.substring(i, j + 1);
//                }
//            }
//        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(""));
        System.out.println(solution.longestPalindrome("a"));
        System.out.println(solution.longestPalindrome("ab"));
        System.out.println(solution.longestPalindrome("aba"));
    }
}
