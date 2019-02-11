package com.argsno.interview.Strings.ReverseString;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] in1 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(in1);
        System.out.println(Arrays.toString(in1));
    }
}
