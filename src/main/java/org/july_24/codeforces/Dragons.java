package org.july_24.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dragons {
    public static void main(String[] args) {
        int s = 2;
        int n = 2;

        List<Dragon> dragons = new ArrayList<>();
        dragons.add(new Dragon(10, 1));
        dragons.add(new Dragon(100, 100));

        Collections.sort(dragons, Comparator.comparingInt(d -> d.strength));

        for(Dragon dragon : dragons){
            if(s <= dragon.strength){
                System.out.println("NO");
                return;
            }
            s += dragon.bonus;
        }

        System.out.println("Yes");




    }
    static class Dragon {
        int strength;
        int bonus;

        Dragon(int strength, int bonus){
            this.strength = strength;
            this.bonus = bonus;
        }
    }
}
