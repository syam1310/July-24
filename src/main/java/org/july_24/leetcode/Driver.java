package org.july_24.leetcode;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        //System.out.println(CanPlaceFlower.canPlaceFlower(flowerbed, n));

        String s = "aec";
        String t = "abcde";
        // System.out.println(IsSubSequnce.isSubSequence(s, t));


        //Catlon.printcatalonNumber(3);

        int[][] pt = PascalTriangle.pascleTriangle(5);
        /*for(int i=0; i<pt.length; i++){
            System.out.println(Arrays.toString(pt[i]));
        }*/

        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        //System.out.println(FindKClosestElements.findClosestElements(arr, k, x));

        int a = 4, b = 4, c = 6;
        System.out.println(MaximumScoreFromRemovingStones.maximumScore(a, b, c));



    }
}
