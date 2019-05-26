package com.argsno.interview.MediumCollection.ArrayAndStrings.LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] exist = new boolean[256];
        int start = 0, end = 0;
        int max = 0;
        while (end < s.length()) {
            if (exist[s.charAt(end)]) {
                while (exist[s.charAt(end)]) {
                    exist[s.charAt(start++)] = false;
                }
                exist[s.charAt(end++)] = true;
            } else {
                exist[s.charAt(end++)] = true;
                if (end - start > max) {
                    max = end - start;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
}
