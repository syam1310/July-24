package org.july_24.leetcode.arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int price : prices) {
            min = Math.min(min, price);
            int profit = price - min;
            max = Math.max(max, profit);
        }
        return max;
    }
}
