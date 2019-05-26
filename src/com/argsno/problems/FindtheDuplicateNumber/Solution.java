package com.argsno.problems.FindtheDuplicateNumber;

public class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) return -1;

        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
