package org.july_24.heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    static class Pair {
        int index;
        int count;

        Pair(int index, int count) {
            this.index = index;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "index=" + index +
                    ", count=" + count +
                    '}';
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        // Create a PriorityQueue to store the rows with their respective counts
        PriorityQueue<Pair> queue = new PriorityQueue<>(
                (a, b) -> {
                    if (a.count != b.count) {
                        return Integer.compare(a.count, b.count);
                    } else {
                        return Integer.compare(a.index, b.index);
                    }
                }
        );

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) count++;
            }
            map.put(i, count);
        }

        for (int key : map.keySet()) {
            queue.offer(new Pair(key, map.get(key)));
        }


        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty()) {
                result[i] = queue.poll().index;
            }
        }

        return result;
    }
}
