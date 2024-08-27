package org.july_24.leetcode.arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int[] arr, int target) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (r = 0; r < arr.length; r++) {
            sum += arr[r];
            while (sum >= target) {
                sum -= arr[l];
                ans = Math.min(ans, r - l + 1);
                l++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
