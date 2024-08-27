package org.july_24.leetcode;

public class MaximumScoreFromRemovingStones {
    public static int maximumScore(int a, int  b, int c){
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int m = a + b + c -max - min;
        if(max-m >= min)return m + min;
        else return min + (max+m-min)/2;
    }
}
