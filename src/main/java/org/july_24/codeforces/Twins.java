package org.july_24.codeforces;

/*
Imagine that you have a twin brother or sister. Having another person that looks exactly like you seems very unusual. It's hard to say if having something of an alter ego is good or bad. And if you do have a twin, then you very well know what it's like.

Now let's imagine a typical morning in your family. You haven't woken up yet, and Mom is already going to work. She has been so hasty that she has nearly forgotten to leave the two of her darling children some money to buy lunches in the school cafeteria. She fished in the purse and found some number of coins, or to be exact, n coins of arbitrary values a1, a2, ..., an. But as Mom was running out of time, she didn't split the coins for you two. So she scribbled a note asking you to split the money equally.

As you woke up, you found Mom's coins and read her note. "But why split the money equally?" — you thought. After all, your twin is sleeping and he won't know anything. So you decided to act like that: pick for yourself some subset of coins so that the sum of values of your coins is strictly larger than the sum of values of the remaining coins that your twin will have. However, you correctly thought that if you take too many coins, the twin will suspect the deception. So, you've decided to stick to the following strategy to avoid suspicions: you take the minimum number of coins, whose sum of values is strictly more than the sum of values of the remaining coins. On this basis, determine what minimum number of coins you need to take to divide them in the described manner.

Input
The first line contains integer n (1 ≤ n ≤ 100) — the number of coins. The second line contains a sequence of n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the coins' values. All numbers are separated with spaces.

Output
In the single line print the single number — the minimum needed number of coins.*/


import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        int n = 2;
        int[] coins = {3,3};

        int totalSum = Arrays.stream(coins).sum();

        Arrays.sort(coins);
        reverse(coins);

        int currSum  = 0;
        int count = 0;

        for(int coin : coins){
            currSum += coin;
            count++;

            if(currSum > totalSum/2){
                break;
            }
        }
        System.out.println(count);

    }
    private static void reverse(int[] arr){
        int l =0;
        int r= arr.length-1;

        while (l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }

}