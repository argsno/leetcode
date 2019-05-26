package com.argsno.interview.EasyCollection.Others.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        for (int i = 1; i <= numRows; i++) {
            List<Integer> l = new ArrayList<>(i);
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    l.add(1);
                } else {
                    l.add(ans.get(i - 2).get(j - 2) + ans.get(i - 2).get(j - 1));
                }
            }
            ans.add(l);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
        System.out.println(solution.generate(0));
    }
}
