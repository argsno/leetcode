package com.argsno.interview.EasyCollection.Strings.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        long ans = 0;
        boolean flag = false;
        if (x < 0) {
            x *= -1;
            flag = true;
        }
        while (x > 0) {
            int digit = x % 10;
            ans *= 10;
            ans += digit;
            x /= 10;
        }
        if (flag) {
            ans *= -1;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(1119999999));
    }
}
