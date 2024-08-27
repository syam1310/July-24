package org.july_24.heap;

import org.july_24.csforall.PrimeSieve;

import java.util.Map;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for(int stone : stones)queue.offer(stone);

        while (queue.size() >= 2){
            int x = queue.poll();
            int y = queue.poll();

            if(x == y)continue;
            else queue.offer(Math.abs(y - x));
        }
        return queue.size() >= 1 ? queue.poll() : 0;
    }
}
