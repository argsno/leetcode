package com.argsno.weekly.contest121.strWithout3a3b;

/**
 * url: https://leetcode-cn.com/contest/weekly-contest-121/problems/string-without-aaa-or-bbb/
 */
public class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder res = new StringBuilder(A + B);
        while (A > 0 || B > 0) {
            if (A == 0) {
                res.append("b");
                B--;
                continue;
            }
            if (B == 0) {
                res.append("a");
                A--;
                continue;
            }
            if (A * 1. / B > 0.5 && B * 1. / A > 0.5) {
                if (A > B) {
                    res.append("ab");
                } else {
                    res.append("ba");
                }
                A--;
                B--;
            } else {
                if (A > B) {
                    res.append("aab");
                    A -= 2;
                    B -= 1;
                } else {
                    res.append("bba");
                    A -= 1;
                    B -= 2;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strWithout3a3b(1, 1));
        System.out.println(solution.strWithout3a3b(3, 3));
        System.out.println(solution.strWithout3a3b(1, 2));
        System.out.println(solution.strWithout3a3b(4, 1));
        System.out.println(solution.strWithout3a3b(100, 50));
    }
}
