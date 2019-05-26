package com.argsno.interview.MediumCollection.InsertDeleteGetRandomO1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    ArrayList<Integer> nums;
    HashMap<Integer, Integer> locs;
    Random rand;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        nums = new ArrayList<>();
        locs = new HashMap<>();
        rand = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (locs.containsKey(val)) return false;
        nums.add(val);
        locs.put(val, nums.size() - 1);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!locs.containsKey(val)) return false;
        int loc = locs.get(val);
        int last = nums.get(nums.size() - 1);
        int lastLoc = locs.get(last);
        int temp = nums.get(loc);
        locs.put(last, loc);
        nums.set(loc, nums.get(lastLoc));
        nums.set(lastLoc, temp);

        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(3));
        System.out.println(randomizedSet.insert(-2));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(1));
    }
}
