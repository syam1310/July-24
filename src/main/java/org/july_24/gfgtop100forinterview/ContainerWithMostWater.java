package org.july_24.gfgtop100forinterview;

public class ContainerWithMostWater {
    public static int mostWater(int[] arr){
        int area = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                area = Math.max(area, Math.min(arr[i], arr[j]) * (j - i));
            }
        }

        return area;
    }
    public static int mostWaterOptimize(int[] arr){
        int area = 0;
        int l = 0;
        int r = arr.length-1;

        while (l <= r){
            area = Math.max(area, Math.min(arr[l], arr[r]) * (r - l));
            if(arr[l] < arr[r])l += 1;
            else r -= 1;
        }
        return area;
    }
}
