package org.july_24.leetcode;

public class IsSubSequnce {
    public static boolean isSubSequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
            if (i == s.length()) return true;

        }
        return false;
    }
}
