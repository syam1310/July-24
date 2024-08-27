package org.july_24.leetcode.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr){
        int n = arr.length;
        if(n == 1)return;
        int i = 1;
        int lastIncluded = -1;

        while (i<n){
            if(arr[i] > arr[i-1]){
                lastIncluded = i;
            }
            i++;
        }

        if(lastIncluded == -1){
            for(i=0; i<n/2; i++){
                int temp = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = temp;
            }
            return;
        }
        int mn = arr[lastIncluded];
        int index = lastIncluded;
        for(i = lastIncluded; i<n; i++){
            if(arr[i] > arr[lastIncluded - 1] && arr[i] < arr[index]){
                index = i;
            }
        }

        int temp = arr[lastIncluded-1];
        arr[lastIncluded-1] = arr[index];
        arr[index] = temp;

        Arrays.sort(arr, lastIncluded, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
