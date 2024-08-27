package org.july_24.heap;

import java.util.PriorityQueue;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] scores){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b -a);
        String[] res = new String[scores.length];
        for(int score : scores)queue.add(score);

        int count = 0;
        while (!queue.isEmpty()){
            count++;
            int temp = queue.poll();
            for(int i=0; i<scores.length; i++){
                if(scores[i] == temp){
                    if(count == 1){
                        res[i] = "Gold Medal";
                    } else if (count == 2) {
                        res[i] = "Silver Medal";
                    } else if (count == 3) {
                        res[i] = "Bronze Medal";
                    }else{
                        res[i] = count+"";
                    }
                }
            }
        }

        return res;
    }
}
