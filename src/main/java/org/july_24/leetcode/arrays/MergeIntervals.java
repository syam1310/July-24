package org.july_24.leetcode.arrays;


/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] mergeInterval(int[][] intervals){
        if(intervals.length <= 1)return intervals;
        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (arr1, arr2) -> {
            if(arr1[0] > arr2[0])return 1;
            else if(arr1[0] < arr2[0])return -1;
            else return 0;
        });

        int[] curr = intervals[0];
        res.add(curr);

        for(int[] interval : intervals){
            int currStart = curr[0];
            int currEnd = curr[1];
            int nxtStart = interval[0];
            int nxtEnd = interval[1];

            if(currEnd >= nxtStart){
                curr[1] = Math.max(currEnd, nxtEnd);
            }else{
                curr = interval;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
