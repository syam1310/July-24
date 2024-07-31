package org.july_24.codeforces;

public class Expression {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 3;

        int res1 = a + b+ c;
        int res2 = a + (b * c);
        int res3 = (a + b) * c;
        int res4 = a * b * c;
        int res5 = (a * b) + c;
        int res6 = a * (b + c);

        int max = Math.max(res1, Math.max(res2, Math.max(res3, Math.max(res4, Math.max(res5, res6)))));

        System.out.println(max);
    }
}
