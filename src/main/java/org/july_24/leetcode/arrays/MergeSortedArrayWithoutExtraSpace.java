package org.july_24.leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArrayWithoutExtraSpace {

    // insertion Sort
    public static void mergeWithSpace(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        for (int i = m - 1; i >= 0; i--) {
            int last = arr1[n - 1], j = 0;
            for (j = n - 2; j >= 0 && arr1[j] > arr2[i]; j--)
                arr1[j + 1] = arr1[j];

            if (last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
        System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }
}
