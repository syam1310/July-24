package org.july_24.leetcode.binarysearch;

import java.util.Arrays;

public class FindMinInRotatedSortedArray {

    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    // O(n)
    public static int findMinByPivote(int[] arr){
        if(arr[0] > arr[arr.length-1]){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1])return i+1;
            }
        }else if(arr[0] < arr[arr.length-1]){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1])return i+1;
            }
        }
        return -1;
    }

    public static int findMinLogN(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while (l<r){
            int mid = l + (r - l)/2;
            if(arr[mid] < arr[r]){
                r= mid;
            }else{
                l = mid  + 1;
            }
        }
        return arr[l];
    }
}
