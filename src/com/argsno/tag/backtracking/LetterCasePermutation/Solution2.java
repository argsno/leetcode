package com.argsno.tag.backtracking.LetterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        helper(S.toCharArray(), res, 0);
        return res;
    }

    private void helper(char[] chs, List<String> res, int pos) {
        if (pos == chs.length) {
            res.add(new String(chs));
            return;
        }
        if (Character.isLetter(chs[pos])) {
            chs[pos] = Character.toLowerCase(chs[pos]);
            helper(chs, res, pos+1);

            chs[pos] = Character.toUpperCase(chs[pos]);
            helper(chs, res, pos+1);
        } else {
            helper(chs, res, pos+1);
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.letterCasePermutation("a1b2"));
    }
}
