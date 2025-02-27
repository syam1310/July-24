package org.july_24.csforall.bit;

public class CountSetBit {
    public static int count(int n){
        int count = 0;
        while (n != 0){
            int resultant = (n & 1);
            if(resultant > 0)count++;
            n = (n >> 1);
        }
        return count;
    }
    public static int count2(int n){
        int count = 0;
        for(int i=0; i<32; i++){
            if((n & (1 << i)) > 0)count++;
        }
        return count;
    }
}
