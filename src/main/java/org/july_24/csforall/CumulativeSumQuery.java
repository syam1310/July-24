package org.july_24.csforall;
/*

You are given a list of N numbers and Q queries. Each query is specified by two numbers i and j; the answer to each query is the sum of every number between the range [i, j] (inclusive).

Note: the query ranges are specified using 0-based indexing.

Input
The first line contains N, the number of integers in our list (N <= 100,000). The next line holds N numbers that are guaranteed to fit inside an integer. Following the list is a number Q (Q <= 10,000). The next Q lines each contain two numbers i and j which specify a query you must answer (0 <= i, j <= N-1).

Output
For each query, output the answer to that query on its own line in the order the queries were made.

        Example
Input:
        3
        1 4 1
        3
        1 1
        1 2
        0 2
*/


import java.util.ArrayList;
import java.util.List;

public class CumulativeSumQuery {
    public static List<Integer> cummulativeSumQuery(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        for (int[] query : queries) {
            int last = query[1];
            int first = query[0];

            if (first != 0) {
                list.add(arr[last] - arr[first - 1]);
            } else {
                list.add(arr[last]);
            }
        }
        return list;
    }
}
