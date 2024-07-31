package org.july_24.bitmanupulation;

public class BitMain {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 4, 1000988880};
        System.out.println(SingleNumber.singleNumber(arr));

        String s = "abcd";
        String t = "eacbd";
        System.out.println(FindTheDifference.findTheDifference(s, t));

    }
}