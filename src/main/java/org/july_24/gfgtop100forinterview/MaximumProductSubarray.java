package org.july_24.gfgtop100forinterview;

import java.util.ArrayList;
import java.util.List;

public class MaximumProductSubarray {
    public static int maximumProductSubarray(int[] arr) {
        List<List<Integer>> sub = new ArrayList<>();
        subsets(arr, 0, new ArrayList<>(), sub);
        System.out.println(sub);
        int res = 0;
        for (int i = 1; i < sub.size() - arr.length / 2 - 1; i++) {
            int mul = 1;
            for (int num : sub.get(i)) {
                mul *= num;
            }
            res = Math.max(res, mul);
        }

        return res;
    }

    public static void subsets(int[] arr, int i, List<Integer> path, List<List<Integer>> subsets) {
        if (i == arr.length) {
            subsets.add(new ArrayList<>(path));
            return;
        }
        subsets(arr, i + 1, path, subsets);
        path.add(arr[i]);
        subsets(arr, i + 1, path, subsets);
        path.remove(path.size() - 1);
    }

    public static int maxProductSubArray(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                result = Math.max(result, mul);
                mul *= arr[j];

            }
            result = Math.max(result, mul);
        }
        return result;
    }
    public static int maxProductSumKaddansAlgo(int[] arr){
        int max_end_here = arr[0];
        int min_end_here = arr[0];
        int max_so_for = arr[0];

        for(int i=1; i<arr.length; i++){
            int temp = Math.max(Math.max(arr[i], arr[i] * max_end_here), arr[i] * min_end_here);
            min_end_here = Math.min(Math.min(arr[i], arr[i] * min_end_here), arr[i] * max_end_here);
            max_end_here = temp;
            max_so_for = Math.max(max_so_for, max_end_here);
        }
        return max_so_for;
    }
}
