package com.argsno.interview.Math.RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int cur;
        for (int i = 0; i < s.length(); i++) {
            cur = m.get(s.charAt(i));
            if (i != s.length() - 1 && m.get(s.charAt(i+1)) > cur) {
                cur = m.get(s.charAt(i+1)) - cur;
                i++;
            }
            sum += cur;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
