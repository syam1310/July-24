package org.july_24.map;

public class Driver {
    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.put(1, 2);

        System.out.println(map.get(1));
    }
}
