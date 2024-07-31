package org.july_24.codeforces;

import java.util.HashSet;
import java.util.Set;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        int n = 4;

        int[] levelX = {1, 2, 3};
        int[] levelY = {2, 3};

        Set<Integer> combineLevel = new HashSet<>();

        for (int x : levelX) combineLevel.add(x);
        for (int y : levelY) combineLevel.add(y);

        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            if (!combineLevel.contains(i)) {
                flag = false;
                break;
            }
            ;
        }
        if (flag)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
