package org.july_24.leetcode;

public class PascalTriangle {
    public static int[][] pascleTriangle(int n){
        int[][] pt = new int[n+1][n+1];
        pt[0][0] = 1;
        for(int i=1; i<pt.length; i++){
            for(int j=0; j<pt.length; j++){
                if(j == 0){
                    pt[i][j] = 1;
                }else if(i == j){
                    pt[i][j] = 1;
                }else{
                    pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
                }
            }
        }
        return pt;
    }
}
