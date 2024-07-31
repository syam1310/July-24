package org.july_24.codeforces;

public class LuckyNumber {

    public static void main(String[] args) {
        int n = 78;

        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

        boolean isAlmostLucy = false;

        for(int lucyNumber : luckyNumbers){
            if(n%lucyNumber == 0){
                isAlmostLucy = true;
                break;
            }
        }

        if(isAlmostLucy){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
