package com.argsno.interview.EasyCollection.Others.ReverseBits;

public class Solution {
    public int reverseBits(int n) {
        int m = 32;
        int ans = 0;
        while (m-- > 0) {
            ans += n & 1;
            n >>>= 1;
            if (m != 0) {
                ans <<= 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(43261596));
    }
}
