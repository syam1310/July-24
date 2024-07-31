package org.july_24.codeforces;

import java.util.Scanner;

public class MatrixMove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int row = -1, col = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        scanner.close();

        int targetRow = 3;
        int targetCol = 3;

        int moves = Math.abs(row - targetRow) + Math.abs(col - targetCol);

        System.out.println(moves);
    }
}


