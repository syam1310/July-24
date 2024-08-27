package org.july_24.gfgtop100forinterview;

public class MinimumElementInASortedAndRotatedArray {
    public static int findMin(int[] arr){
        int index = -1;
        if(arr[0] > arr[arr.length-1]){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    index = i + 1;
                    break;
                }
            }
        }else if(arr[0] > arr[arr.length-1]){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    index = i + 1;
                    break;
                }
            }
        }
        return index >= 0 ? arr[index] : arr[0];
    }
}
