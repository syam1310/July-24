package org.july_24.csforall;

import java.util.Arrays;
import java.util.Comparator;

public class NoorAndHisPond {
    public static int maxIndependentSet(Fish[] fishArray) {
        Arrays.sort(fishArray, Comparator.comparingInt(fish -> fish.eatingFactor));

        int n = fishArray.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (fishArray[j].size <= fishArray[i].eatingFactor) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            maxSize = Math.max(maxSize, dp[i]);
        }
        return maxSize;
    }

    static class Fish {
        int size;
        int eatingFactor;

        Fish(int size, int eatingFactor) {
            this.size = size;
            this.eatingFactor = eatingFactor;
        }
    }
}
