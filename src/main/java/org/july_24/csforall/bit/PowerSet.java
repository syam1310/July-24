package org.july_24.csforall.bit;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static int power(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                ans = ans * base;
                power--;
            } else {
                base = base * base;
                power /= 2;
            }
        }
        return ans;
    }

    public static void subsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= power(2, arr.length) - 1; i++) {
            int number = i;
            List<Integer> temp = new ArrayList<>();
            int counter = 0;
            while (number != 0) {
                int resultant = (number & 1);
                if (resultant > 0) {
                    temp.add(arr[counter]);
                }
                counter++;
                number = number >> 1;
            }
            res.add(temp);
        }
        System.out.println(res);
    }

    public static void subsets2(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= power(2, arr.length) - 1; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 32; j++) {
                int resultant = (i & (1 << j));
                if (resultant > 0)
                    temp.add(arr[j]);
            }
            res.add(temp);
        }
        System.out.println(res);
    }
}
