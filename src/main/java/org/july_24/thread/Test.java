package org.july_24.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static List<List<Integer>> getNum(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            res.add(Arrays.asList(arr[i], arr[n/2+i]));
        }
        return res;
    }
}
