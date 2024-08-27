package org.july_24.csforall.bit;

public class EvenOrOdd {
    public static void evenOrOdd(int n){
        if((n&1) == 1){
            System.out.println("The number is odd: "+ n);
        }else{
            System.out.println("The number is even: "+ n);
        }
    }
}
