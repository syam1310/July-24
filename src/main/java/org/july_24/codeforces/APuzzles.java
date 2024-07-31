package org.july_24.codeforces;

import java.util.Arrays;

public class APuzzles {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;

        int[] puzzleSize = {10, 12, 10, 7, 5, 22};

        Arrays.sort(puzzleSize);

        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<=m-n; i++){
            int currDiff = puzzleSize[i+n-1] - puzzleSize[i];
            if(currDiff < minDiff)minDiff = currDiff;
        }
        System.out.println(minDiff);

    }
}
