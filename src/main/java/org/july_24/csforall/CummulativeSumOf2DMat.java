package org.july_24.csforall;

import java.util.Arrays;

public class CummulativeSumOf2DMat {
    public static void cumSumOf2DMat(int[][] mat) {
        int[][] cum_mat = new int[mat.length][mat[0].length];
        int rows = mat.length;
        int cols = mat[0].length;

        for (int cum_row_indx = 0; cum_row_indx < rows; cum_row_indx++) {
            for (int cum_col_indx = 0; cum_col_indx < cols; cum_col_indx++) {
                int sum = 0;
                for (int row_indx = 0; row_indx <= cum_row_indx; row_indx++) {
                    for (int col_indx = 0; col_indx <= cum_col_indx; col_indx++) {
                        sum += mat[row_indx][col_indx];
                    }
                }
                cum_mat[cum_row_indx][cum_col_indx] = sum;
            }
        }

        for (int[] arr : cum_mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void cumSumOptimize(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] cum_mat = new int[rows][cols];

        cum_mat[0][0] = mat[0][0];
        for (int cum_col = 1; cum_col < cols; cum_col++) {
            cum_mat[0][cum_col] = cum_mat[0][cum_col - 1] + mat[0][cum_col];
        }
        for (int cum_row = 1; cum_row < rows; cum_row++) {
            cum_mat[cum_row][0] = cum_mat[cum_row - 1][0] + mat[cum_row][0];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                cum_mat[i][j] = cum_mat[i][j - 1] + cum_mat[i - 1][j] + mat[i][j] - cum_mat[i - 1][j - 1];
            }
        }
        for (int[] arr : cum_mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
