package org.july_24.leetcode.binarysearch;

public class UpperBound {
    public static int upperBound(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
