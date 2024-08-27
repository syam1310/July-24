package org.july_24.leetcode.arrays;

import org.july_24.csforall.PrimeSieve;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static List<Integer> maxSlidingWindow(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b -a);
        for(int i=0; i<k-1; i++){
            queue.add(nums[i]);
        }
        List<Integer> res = new ArrayList<>();

        for(int i=k; i<nums.length; i++){
            res.add(queue.peek());
            queue.poll();
            queue.add(nums[i]);
        }
        return res;
    }

    // TLE
    public static List<Integer> maxSlidinggWindow(int[] nums, int k){
        int l=0, r = k - 1;
        List<Integer> res = new ArrayList<>();
        while (r < nums.length){
            int max = Integer.MIN_VALUE;
            for(int i=l; i<=r; i++){
                max = Math.max(max, nums[i]);
            }
            l++; r++;
            res.add(max);
        }
        return res;
    }
}
