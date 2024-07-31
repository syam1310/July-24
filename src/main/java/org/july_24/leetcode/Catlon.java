package org.july_24.leetcode;

public class Catlon {


//    Catalan numbers satisfy the following recursive formula: C_0=C_1=1 \ and \ C_{n}=\sum_{i=0}^{n-1}C_iC_{n-i-1} \ for \ n\geq 2
//
//    Step-by-step approach:
//
//    Base condition for the recursive approach, when n <= 1, return 1
//    Iterate from i = 0 to i < n
//    Make a recursive call catalan(i) and catalan(n – i – 1) and keep adding the product of both into res.
//    Return the res.
    private static int catlon(int n) {
        int res = 0;

        if(n <= 1)return 1;

        for(int i=0; i<n; i++){
            res += catlon(i) * catlon(n-i-1);
        }
        return res;

    }

    public static void printcatalonNumber(int n){
        for(int i=0; i<=n; i++){
            System.out.println(catlon(i));
        }
    }


}
