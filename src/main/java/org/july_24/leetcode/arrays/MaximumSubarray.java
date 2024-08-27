package org.july_24.leetcode.arrays;

public class MaximumSubarray {
    public static int maximumSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int a : arr){
            currSum += a;
            if(currSum > maxSum)maxSum = currSum;
            if(currSum < 0)currSum = 0;
        }
        return maxSum;
    }
}
