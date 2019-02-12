package com.argsno.interview.Design.ShuffleanArray;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    private int[] orig;
    private int[] arr;
    private Random rand = new Random();

    public Solution(int[] nums) {
        this.orig = nums;
        this.arr = Arrays.copyOf(nums, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.orig;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = arr.length; i > 1; i--) {
            swap(arr, i-1, rand.nextInt(i));
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
