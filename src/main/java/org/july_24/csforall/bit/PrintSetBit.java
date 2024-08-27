package org.july_24.csforall.bit;

public class PrintSetBit {
    public static void printSetBit(int n) {
        int counter = 0;
        while (n != 0) {
            int resultant = (n & 1);
            if (resultant > 0) {
                int ans = power(2, counter);
                System.out.println(ans);
            }
            counter++;
            n = (n >> 1);
        }
    }

    private static int power(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) { // if power is odd
                ans = ans * base;
                power = power - 1;
            } else {
                base = base * base;
                power = power / 2;
            }
        }
        return ans;
    }
}
