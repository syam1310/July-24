package org.july_24.codeforces;

import java.util.Scanner;

public class EquilibriumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of vectors
        int n = scanner.nextInt();

        // Initialize sums for x, y, and z components
        int sumX = 0, sumY = 0, sumZ = 0;

        // Process each vector
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            sumX += x;
            sumY += y;
            sumZ += z;
        }
        scanner.close();

        // Check if all sums are zero
        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
