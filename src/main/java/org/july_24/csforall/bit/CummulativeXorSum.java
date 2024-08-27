package org.july_24.csforall.bit;

public class CummulativeXorSum {
    public static int commulativeXorSum(int n) {
        if (n % 4 == 1) return 1;
        else if (n % 4 == 2) return n + 1;
        else if (n % 4 == 3) return 0;
        else return n;
    }
}
