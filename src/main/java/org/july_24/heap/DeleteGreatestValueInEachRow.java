package org.july_24.heap;

import java.util.PriorityQueue;

public class DeleteGreatestValueInEachRow {
    public static int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        int[] sum = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                queue.offer(grid[i][j]);
            }
            int k = 0;
            while (k < grid[i].length) {
                int t = queue.poll();
                sum[k] = Math.max(sum[k], t);
                k++;
            }
        }
        int res = 0;
        for (int i = 0; i < sum.length; i++) {
            res += sum[i];
        }

        return res;
    }
}
