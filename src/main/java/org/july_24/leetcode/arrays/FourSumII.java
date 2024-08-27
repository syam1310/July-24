package org.july_24.leetcode.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSumII {
    public static int fourSumIIOp1(int[] arr1, int[] arr2, int[] arr3, int[] arr4){
        int count = 0;
        for(int i : arr1){
            for(int j : arr2){
                for(int k : arr3){
                    for(int l : arr4){
                        if(i + j + k + l == 0)count++;
                    }
                }
            }
        }
        return count;
    }
    public static int fourSumIIOp2(int[] arr1, int[] arr2, int[] arr3, int[] arr4){
        Map<Integer, Integer> map = new HashMap<>();
        for(int l : arr4){
            map.put(l, map.getOrDefault(l, 0) + 1);
        }

        int count = 0;
        for(int i : arr1){
            for(int j : arr2){
                for(int k : arr3){
                    int target = - (i + j + k);
                    count = map.get(target);
                }
            }
        }
        return count;
    }
    public static int fourSumIIOp3(int[] arr1, int[] arr2, int[] arr3, int[] arr4){
        Map<Integer,Integer> map = new HashMap<>();

        for(int k : arr3){
            for(int l : arr4){
                map.put(k + l, map.getOrDefault(k + l, 0) + 1);
            }
        }
        int count = 0;
        for(int i : arr1){
            for(int j : arr2){
                count += map.getOrDefault(-(i + j), 0);
            }
        }
        return count;
    }
}
