package org.july_24.heap;


/*
You are given a positive integer num. You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).

Return the largest possible value of num after any number of swaps.



Example 1:

Input: num = 1234
Output: 3412
Explanation: Swap the digit 3 with the digit 1, this results in the number 3214.
Swap the digit 2 with the digit 4, this results in the number 3412.
Note that there may be other sequences of swaps but it can be shown that 3412 is the largest possible number.
Also note that we may not swap the digit 4 with the digit 1 since they are of different parities.
*/

import java.util.PriorityQueue;

public class LargestNumberAfterDigitSwapsByParity {
    public static int largestInteger(int num) {
        PriorityQueue<Integer> oddPq = new PriorityQueue<>();
        PriorityQueue<Integer> evenPq = new PriorityQueue<>();
        int ref = num;


        while (num > 0) {
            int curr = num % 10;
            if (curr % 2 != 0) {
                oddPq.add(curr);
            } else {
                evenPq.add(curr);
            }
            num /= 10;
        }
        int num2 = 0;
        int mul = 1;

        while (ref > 0) {
            int curr = ref % 10;
            if (curr % 2 != 0) {
                num2 = oddPq.poll() * mul + num2;
            } else {
                num2 = evenPq.poll() * mul + num2;
            }
            ref /= 10;
            mul *= 10;
        }
        return num2;
    }
}
