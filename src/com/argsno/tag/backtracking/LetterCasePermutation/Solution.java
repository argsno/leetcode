package com.argsno.tag.backtracking.LetterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        backtrack(S.toCharArray(), 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(char[] S, int start, StringBuilder temp, List<String> res) {
        if (S.length == temp.length()) {
            res.add(temp.toString());
            return;
        }
        for (int i = start; i < S.length; i++) {
            if (Character.isLetter(S[i])) {
                temp.append(Character.toLowerCase(S[i]));
                backtrack(S, i + 1, temp, res);
                temp.deleteCharAt(temp.length() - 1);
                temp.append(Character.toUpperCase(S[i]));
                backtrack(S, i + 1, temp, res);
                temp.deleteCharAt(temp.length() - 1);
            } else {
                temp.append(S[i]);
                backtrack(S, i + 1, temp, res);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCasePermutation(""));
    }
}
