package org.july_24.gfgtop100forinterview;

public class TraipingRainWater {

    // O(n^2)
    public static int traipingWaterBrutForce(int[] arr, int n) {
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    // O(n)
    public static int traipingRainWaterOptimal(int[] arr, int n) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            res += Math.min(left[i], right[i]) - arr[i];
        }
        return res;
    }
}
