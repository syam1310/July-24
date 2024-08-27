package org.july_24.leetcode.binarysearch;

public class FindPeakElement {

    // Brut Force approach
    public static int findPeakElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i - 1] < arr[i]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) return i;
        }
        return -1;
    }

    public static int findPeakElementLogN(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        if (n == 2) {
            return arr[0] > arr[1] ? 0 : 1;
        }
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if(mid == 0)return arr[l] > arr[r] ? l : r;
            if(mid == arr.length-1) return arr[l] > arr[r] ? l : r;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
