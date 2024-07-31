package org.july_24.codeforces;

import java.util.Arrays;

public class Dubstep {
    public static void main(String[] args) {
        String s = "WUBWUBABCWUB";

        String[] sa = s.split("WUB");



        for(String word : sa){
            if(!word.isEmpty())
            System.out.print(word+" ");
        }
    }
}
