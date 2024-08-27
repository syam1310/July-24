package org.july_24.heap;

import java.util.PriorityQueue;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static int minimumOperations(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : arr) queue.offer(num);

        System.out.println(queue);
        int temp = -1;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int pooled = queue.poll();

            if (pooled == 0 || pooled == temp) continue;

            temp = pooled;
            res++;
        }
        return res;
    }
}
