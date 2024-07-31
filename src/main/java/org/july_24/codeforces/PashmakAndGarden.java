package org.july_24.codeforces;

public class PashmakAndGarden {
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;

        if (x1 == x2) {
            int sideLength = Math.abs(y2 - y1);
            System.out.println((x1 + sideLength) + " " + y1 + " " + (x2 + sideLength) + " " + y2);
        } else if (y1 == y2) {
            int sideLength = Math.abs(x2 - x1);
            System.out.println(x1 + " " + (y1 + sideLength) + " " + x2 + " " + (y2 + sideLength));
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else {
            System.out.println(-1);
        }
    }
}
