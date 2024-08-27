package org.july_24.leetcode.arrays;

public class KthSmallestElement {
    public static int kthSmallestElement(int[] arr, int k){
        return quickSelect(arr, 0, arr.length-1, k);
    }
    private static int quickSelect(int[] arr, int l, int r, int k){
        int partition = partition(arr, l, r);
        if(partition == arr.length-k)return arr[partition];
        else if(partition < arr.length-k)return quickSelect(arr, partition+1, r, k);
        else return quickSelect(arr, l, partition-1, k);
    }
    private static int partition(int[] arr, int l, int r){
        int i = l - 1;
        int pivote = arr[r];

        for(int j=l; j<=r; j++){
            if(arr[j] < pivote){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
}
