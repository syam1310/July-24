package org.july_24.csforall;

public class FindingTheKthPrime {
    public static int kthPrime(int k) {
        final int MAX = 5000000;
        boolean[] isPrime = new boolean[MAX + 1];
        int[] primes = new int[MAX + 1];
        int primeCount = 0;

        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= MAX; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= MAX; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                primes[primeCount++] = i;
            }
        }
        return primes[k - 1];
    }
}
