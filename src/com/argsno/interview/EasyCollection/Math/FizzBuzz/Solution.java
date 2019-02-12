package com.argsno.interview.EasyCollection.Math.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>(n);
        int i3 = 3, i5 = 5;
        for (int i = 1; i <= n; i++) {
            i3--;
            i5--;
            if (i3 == 0 && i5 == 0) {
                i3 = 3;
                i5 = 5;
                res.add("FizzBuzz");
            } else if (i3 == 0) {
                i3 = 3;
                res.add("Fizz");
            } else if (i5 == 0) {
                i5 = 5;
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(15));
    }
}
