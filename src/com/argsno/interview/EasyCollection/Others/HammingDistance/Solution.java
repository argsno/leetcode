package com.argsno.interview.EasyCollection.Others.HammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        return hammingDistance(a);
    }

    private int hammingDistance(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n & 1;
            n >>>= 1;
        }
        return sum;
    }
}
