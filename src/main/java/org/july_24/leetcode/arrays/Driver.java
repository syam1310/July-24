package org.july_24.leetcode.arrays;

import org.july_24.csforall.FindingTheKthPrime;

public class Driver {
    public static void main(String[] args) {
//        int[] arr = {3,2,1,4, 6,5};
//        System.out.println(KthSmallestElement.kthSmallestElement(arr, 2));

//        int[] arr = {2, 0, 2, 1,0, 2,1,0,2,1};
//        SortColor.sortColor(arr);

//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(MaximumSubarray.maximumSubArray(arr));

//        int[] arr1 = {0,5,8,20};
//        int[] arr2 = {1, 3, 4, 5, 6};
//
//        MergeSortedArrayWithoutExtraSpace.mergeWithSpace(arr1, arr2);

        /*int[][] intervals = {{1,3}, {8,10}, {2,6},{15, 18}};
        int[][] res = MergeIntervals.mergeInterval(intervals);
        for(int[] a : res){
            System.out.println(Arrays.toString(a));
        }*/

//        int[] prices = {7, 6, 4, 3, 1};
//        System.out.println(BestTimeToBuyAndSellStock.maxProfit(prices));

//        int[] arr = {1, 2, 3, 1, 2, 3, 2, 2};
//
//        System.out.println(MajorityElementMoores.getMajorityEle(arr));

//        int[] arr = {2, 3, 1, 2, 4, 3};
//        int target = 7;
//        System.out.println(MinimumSizeSubarraySum.minSubArrayLen(arr, target));

//        int[] arr = {1,0,-1,0,-2,2};
//        int target = 0;
//        System.out.println(FourSum.fourSum(arr, target));

//        int[] arr1 = {1, 2};
//        int[] arr2 = {-2, -1};
//        int[] arr3 = {-1, 2};
//        int[] arr4 = {0, 2};
//        System.out.println(FourSumII.fourSumIIOp1(arr1, arr2, arr3, arr4));
//       // System.out.println(FourSumII.fourSumIIOp2(arr1, arr2, arr3, arr4));
//        System.out.println(FourSumII.fourSumIIOp3(arr1, arr2, arr3, arr4));

//        int[] arr = {1,1,5};
//        NextPermutation.nextPermutation(arr);

        int[] nums = {1,3,1,3,5,3,6,7};
        int k = 3;
        System.out.println(SlidingWindowMaximum.maxSlidinggWindow(nums, k));


    }
}
