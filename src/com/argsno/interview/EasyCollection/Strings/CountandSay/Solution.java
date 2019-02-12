package com.argsno.interview.EasyCollection.Strings.CountandSay;

public class Solution {
    public String countAndSay(int n) {
        String[] ans = new String[31];
        ans[1] = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            String prev = ans[i - 1];
            int j = 1;
            int count = 1;
            while (j < prev.length()) {
                if (prev.charAt(j) == prev.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(prev.charAt(j - 1));
                    count = 1;
                }
                j++;
            }
            sb.append(count);
            sb.append(prev.charAt(prev.length() - 1));
            ans[i] = sb.toString();
        }
        return ans[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(1));
        System.out.println(solution.countAndSay(2));
        System.out.println(solution.countAndSay(3));
        System.out.println(solution.countAndSay(4));
        System.out.println(solution.countAndSay(5));
    }
}
