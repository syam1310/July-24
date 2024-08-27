package org.july_24.leetcode.binarysearch;

public class SearchIn2DMat {
    public static boolean search(int[][] mat, int target){
        int row = mat.length-1;
        int col = 0;

        while (row >= 0 && col < mat[0].length){
            if(mat[row][col] == target)return true;
            else if(mat[row][col] < target)col++;
            else row--;
        }
        return false;
    }
}
