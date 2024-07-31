package org.july_24.codeforces;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;


        int minMoves = (n + 1) / 2;

        while (minMoves % m != 0)minMoves++;

        if(minMoves <= n){
            System.out.println(minMoves);
        }else{
            System.out.println(-1);
        }

    }
}
