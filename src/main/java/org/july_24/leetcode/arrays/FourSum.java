package org.july_24.leetcode.arrays;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int l = j + 1;
                int r = arr.length - 1;

                while (l < r) {
                    int sum = arr[i] + arr[j] + arr[l] + arr[r];
                    if (sum == target) {
                        set.add(Arrays.asList(arr[i], arr[j], arr[l], arr[r]));
                        l++;
                        r--;
                    } else if (sum < target) l++;
                    else r--;
                }
            }
        }
        res.addAll(set);
        return res;
    }
}
