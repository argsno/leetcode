package com.argsno.interview.EasyCollection.Others.Numberof1Bits;

public class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n & 1;
            n >>>= 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(-3));
    }
}
