package org.july_24.heap;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int n, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);

//        for(int i : arr){
//            queue.offer(i);
//        }
//        int res = 0;
//        while (k > 0){
//            res = queue.poll();
//            k--;
//        }

        for(int num : arr){
            queue.offer(num);

            if(queue.size() > k){
                queue.poll();
            }
        }
        System.out.println(queue);
        return queue.peek();
    }
}
