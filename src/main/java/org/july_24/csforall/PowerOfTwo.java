package org.july_24.csforall;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n <= 0)return false;
        if(n == 1)return true;
        if(n%2 == 0)return isPowerOfTwo(n/2);
        return false;
    }
}
