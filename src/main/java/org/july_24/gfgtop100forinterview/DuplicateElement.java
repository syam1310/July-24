package org.july_24.gfgtop100forinterview;

import java.util.ArrayList;

public class DuplicateElement {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return res;
        }

        int[] freq = new int[arr.length];

        for (int a : arr) {
            if (a >= 0 && a < arr.length) {
                freq[a]++;
            }
        }

        boolean foundDuplicate = false;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                res.add(i);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            res.add(-1);
        }

        return res;
    }
}
