package org.july_24.csforall;

public class Hamburgers {
    public static int numberOfBurgers(String recipes, int[] numOfIngredient, int[] prices, int rubble) {
        int bc = 0;
        int sc = 0;
        int cc = 0;

        for (char c : recipes.toCharArray()) {
            if (c == 'B') bc++;
            else if (c == 'S') sc++;
            else if (c == 'C') cc++;
        }

        int nb = numOfIngredient[0];
        int ns = numOfIngredient[1];
        int nc = numOfIngredient[2];

        int pb = prices[0];
        int ps = prices[1];
        int pc = prices[2];

        int count = 0;

        while (true) {
            int neededB = Math.max(0, bc - nb);
            int neededS = Math.max(0, sc - ns);
            int neededC = Math.max(0, cc - nc);

            long totalCost = (long) neededB * pb + (long) neededS * ps + (long) neededC * pc;

            if (totalCost <= rubble) {
                count++;

                nb -= bc - neededB;
                ns -= sc - neededS;
                nc -= cc - neededC;

                rubble -= totalCost;
            } else {
                break;
            }
        }

        return count;
    }
}
