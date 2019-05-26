package com.argsno.problems.FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] chars = new int[26];
        for (int i = 0; i < p.length(); i++) {
            chars[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isAnagram(s, i, i + p.length(), Arrays.copyOf(chars, chars.length))) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isAnagram(String s, int start, int end, int[] chars) {
        for (int i = start; i < end; i++) {
            chars[s.charAt(i) - 'a']--;
            if (chars[s.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findAnagrams("cbaebabacd", "abc"));
    }
}
