package com.argsno.problems.KthLargestElementinaStream;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> minHeap;
    int size;

    public KthLargest(int k, int[] nums) {
        size = k;
        minHeap = new PriorityQueue<>(k);
        for (int num: nums) {
            if (minHeap.size() >= this.size) {
                minHeap.offer(num);
                minHeap.poll();
            } else {
                minHeap.offer(num);
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() >= this.size) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(kthLargest.add(3));
    }
}
