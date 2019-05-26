package com.argsno.problems.JewelsandStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> j = new HashSet<>();
        for (char c : J.toCharArray()) {
            j.add(c);
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            if (j.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
    }
}
