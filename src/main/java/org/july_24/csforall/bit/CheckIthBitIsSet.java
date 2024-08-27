package org.july_24.csforall.bit;

public class CheckIthBitIsSet {
    public static boolean isBitOrSetOrNot(int n, int i){
        return (n & (1 << i)) > 0 ? true : false;
    }
    public static boolean isIthBitOrSetOrNot(int n, int i){
        n = (n >>i);
        int resultant = (n & 1);
        return resultant > 0 ? true : false;
    }
}
