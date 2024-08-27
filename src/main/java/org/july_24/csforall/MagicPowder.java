package org.july_24.csforall;

public class MagicPowder {

/*
    This problem is given in two versions that differ only by constraints. If you can solve this problem in large constraints, then you can just write a single solution to the both versions. If you find the problem too difficult in large constraints, you can write solution to the simplified version only.

    Waking up in the morning, Apollinaria decided to bake cookies. To bake one cookie, she needs n ingredients, and for each ingredient she knows the value ai — how many grams of this ingredient one needs to bake a cookie. To prepare one cookie Apollinaria needs to use all n ingredients.

    Apollinaria has bi gram of the i-th ingredient. Also she has k grams of a magic powder. Each gram of magic powder can be turned to exactly 1 gram of any of the n ingredients and can be used for baking cookies.

    Your task is to determine the maximum number of cookies, which Apollinaria is able to bake using the ingredients that she has and the magic powder.

            Input
    The first line of the input contains two positive integers n and k (1 ≤ n, k ≤ 1000) — the number of ingredients and the number of grams of the magic powder.

    The second line contains the sequence a1, a2, ..., an (1 ≤ ai ≤ 1000), where the i-th number is equal to the number of grams of the i-th ingredient, needed to bake one cookie.

    The third line contains the sequence b1, b2, ..., bn (1 ≤ bi ≤ 1000), where the i-th number is equal to the number of grams of the i-th ingredient, which Apollinaria has.

    Output
    Print the maximum number of cookies, which Apollinaria will be able to bake using the ingredients that she has and the magic powder.

    Examples
            InputCopy
3 1
        2 1 4
        11 3 16
    OutputCopy
4

*/

    public static int maxNumberOfCookies(int n, int k, int[] req, int[] have) {
        int low = 0;
        int high = 2001;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cost = 0, z = 0;

            for (int i = 0; i < n; i++) {
                cost += Math.max(req[i] * mid - have[i], z);
            }
            if (cost <= k) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }
}
