package org.july_24.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

/*    Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

    An integer a is closer to x than an integer b if:

            |a - x| < |b - x|, or
|a - x| == |b - x| and a < b


    Example 1:

    Input: arr = [1,2,3,4,5], k = 4, x = 3
    Output: [1,2,3,4]*/

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0;
        int j = arr.length - 1;
        List<Integer> list = new ArrayList<>();

        while (j - i >= k) {
            if (Math.abs(arr[i] - x) > Math.abs(arr[j] - x)) {
                i++;
            } else {
                j--;
            }
        }
        for (int l = i; l <= j; l++) {
            list.add(arr[l]);
        }
        return list;
    }
}
