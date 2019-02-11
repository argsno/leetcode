package com.argsno.weekly.contest122.intervalIntersection986;

import com.argsno.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        if (A.length == 0 || B.length == 0) {
            return new Interval[0];
        }
        List<Interval> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            Interval a = A[i];
            Interval b = B[j];
            int min = Math.max(a.start, b.start);
            int max = Math.min(a.end, b.end);
            if (min <= max) {
                res.add(new Interval(min, max));
            }
            if (a.end > b.end) {
                j++;
            } else {
                i++;
            }
        }
        Interval[] r = new Interval[res.size()];
        res.toArray(r);
        return r;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Interval[] a1 = new Interval[]{
                new Interval(0, 2),
                new Interval(5, 10),
                new Interval(13, 23),
                new Interval(24, 25)
        };
        Interval[] b1 = new Interval[]{
                new Interval(1, 5),
                new Interval(8, 12),
                new Interval(15, 24),
                new Interval(25, 26)
        };
        Interval[] res1 = solution.intervalIntersection(a1, b1);
        System.out.println(Arrays.toString(res1));
    }
}
