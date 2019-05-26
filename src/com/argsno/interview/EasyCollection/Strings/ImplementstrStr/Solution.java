package com.argsno.interview.EasyCollection.Strings.ImplementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("hello", ""));
    }
}
