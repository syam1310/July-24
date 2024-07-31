package org.july_24.codeforces;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        int n = -100003;

        if (n > 0) {
            System.out.println(n);
        } else {
            int removeLast = n / 10;

            int last = Math.abs(n % 10);
            int secLast = Math.abs((n / 10) % 10);
            int removeSecLast = (n / 100) * 10 - last;

            int max = Math.max(n, Math.max(removeLast, removeSecLast));

            System.out.println(max);
        }

    }
}
