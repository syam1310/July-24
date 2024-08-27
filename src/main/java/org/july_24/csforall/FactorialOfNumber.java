package org.july_24.csforall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialOfNumber {
    public static List<List<Integer>> fact(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
            res.add(Arrays.asList(i, n / i));
        }
        return res;
    }
}
