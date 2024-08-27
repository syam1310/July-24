package org.july_24.gfgtop100forinterview;

public class ProductExceptItSelf {
    public static long[] productExceptItSelf(int[] arr){
        long[] left = new long[arr.length];
        long[] right = new long[arr.length];
        long[] prod = new long[arr.length];

        left[0] = 1;
        right[arr.length-1] = 1;

        for(int i=1; i<arr.length; i++){
            left[i] = left[i-1] * arr[i-1];
        }
        for(int i=arr.length-2; i>=0; i--){
            right[i] = right[i+1] * arr[i+1];
        }
        for(int i=0; i<prod.length; i++){
            prod[i] = left[i] * right[i];
        }
        return prod;
    }
}
