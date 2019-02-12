package com.argsno.interview.EasyCollection.Strings.LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{
                "flower", "flow", "flight"
        }));
        System.out.println(solution.longestCommonPrefix(new String[]{
                "dog", "racecar", "car"
        }));
        System.out.println(solution.longestCommonPrefix(new String[]{
                "aa", "a"
        }));
    }
}
