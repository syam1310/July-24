package org.july_24.csforall.bit;

public class FindMSBBit {
    public static int msb(int a){
        int MSB = -1;
        int counter = 0;
        while (a != 0){
            int resultant = (a & 1);
            if(resultant > 0){
                MSB = counter;
            }
            counter++;
            a = (a >> 1);
        }
        return MSB;
    }
}
