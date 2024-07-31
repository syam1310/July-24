package org.july_24.codeforces;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        int[] heights = {10, 10, 58, 31, 63, 40, 76};
        int n = heights.length;

        int max_height = -1;
        int max_idx = -1;
        for (int i = 0; i < n; i++) {
            if (heights[i] > max_height) {
                max_height = heights[i];
                max_idx = i;
            }
        }

        int min_height = 101;
        int min_idx = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (heights[i] < min_height) {
                min_height = heights[i];
                min_idx = i;
            }
        }

        int moves = max_idx + (n - 1 - min_idx);

        if (max_idx > min_idx) {
            moves--;
        }


        System.out.println(moves);
    }
}
