package org.july_24.leetcode.binarysearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] arr, int target) {
        int piIndex = findPivote(arr);
        if (piIndex == -1) return binarySearch(arr, target, 0, arr.length - 1);
        int ans = binarySearch(arr, target, 0, piIndex);
        if (ans != -1) return ans;
        else return binarySearch(arr, target, piIndex, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static int findPivote(int[] arr) {
        if (arr[0] > arr[arr.length - 1]) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) return i + 1;
            }
        } else if (arr[0] < arr[arr.length - 1]) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) return i + 1;
            }
        }
        return -1;
    }
}
