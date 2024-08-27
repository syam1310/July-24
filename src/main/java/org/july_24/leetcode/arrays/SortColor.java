package org.july_24.leetcode.arrays;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.

import java.util.Arrays;

public class SortColor {
    public static void sortColor(int[] arr){
        int red = 0;
        int white = 0;
        int blue = arr.length-1;

        while(white <= blue){
            if(arr[white] == 0){
                int temp = arr[red];
                arr[red] = arr[white];
                arr[white] = temp;
                red++;
                white++;
            }else if(arr[white] == 1)white++;
            else{
                int temp = arr[white];
                arr[white] = arr[blue];
                arr[blue] = temp;
                blue--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
