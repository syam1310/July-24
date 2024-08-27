package org.july_24.csforall;

import java.util.ArrayList;
import java.util.List;

public class PrimeSieve {
    public static List<Integer> primeSieve(int n) {
        int[] primeSieve = new int[n + 1];
        primeSieve[0] = 1;
        primeSieve[1] = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primeSieve[i] == 0) {
                for (int mul = i * i; mul <= n; mul += i) {
                    if(primeSieve[i] == 0)
                    primeSieve[mul] = 1;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < primeSieve.length-1; i++) {
            if (primeSieve[i] == 0) {
                res.add(i);
            }
        }
        return res;
    }
}
