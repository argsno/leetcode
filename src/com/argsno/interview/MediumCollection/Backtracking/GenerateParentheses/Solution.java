package com.argsno.interview.MediumCollection.Backtracking.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        gen(res, "", n, 0);
        return res;
    }

    private void gen(List<String> res, String s, int n, int m) {
        if (n == 0 && m == 0) {
            res.add(s);
        }
        if (n > 0) {
            gen(res, s + "(", n - 1, m + 1);
        }
        if (m > 0) {
            gen(res, s + ")", n, m - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
        System.out.println(solution.generateParenthesis(0).size());
    }
}
