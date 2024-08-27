package org.july_24.gfgtop100forinterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairOfGivenSum {
    public static boolean isPairPrasent(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            if(set.contains(sum - a))return true;
            set.add(a);
        }
        return false;
    }
}
