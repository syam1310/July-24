package org.july_24.codeforces;

import java.util.HashSet;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c'};

        Set<Character> set = new HashSet<>();
        for(char c : ch)set.add(c);

        System.out.
                println(set.size());
    }
}
