package org.july_24.leetcode.binarysearch;

public class Driver {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 3, 5, 6, 4};
//        System.out.println(FindPeakElement.findPeakElementLogN(arr));

        int[] arr = {4,5,6,7,0,1,2};
        //System.out.println(FindMinInRotatedSortedArray.findMinLogN(arr));
        //System.out.println(FindMinInRotatedSortedArray.findMinByPivote(arr) == -1 ? -1 : FindMinInRotatedSortedArray.findMinByPivote(arr));

        //System.out.println(SearchInRotatedSortedArray.search(arr, 2));

        // UpperBound & LowerBound

        int[] lu = {5,7,7,8,8,10};
        System.out.println(UpperBound.upperBound(lu, 8));
        System.out.println(LowerBound.lowerBound(lu, 8));

        int[][] mat = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        System.out.println(SearchIn2DMat.search(mat, 60));
    }
}
