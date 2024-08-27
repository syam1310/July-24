package org.july_24.leetcode.arrays;

public class MajorityElementMoores {

    // Moores algo gretter then n/2
    public static int getMajorityEle(int[] arr){
        int freq = 1;
        int curr = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[curr] == arr[i]){
                freq++;
            }else{
                freq--;
            }
            if(freq < 0){
                freq = 1;
                curr = i;
            }
        }
        return arr[curr];
    }
}
