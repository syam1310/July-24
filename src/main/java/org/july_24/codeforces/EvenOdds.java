package org.july_24.codeforces;

public class EvenOdds {
    public static void main(String[] args) {
        int n = 7;
        int k = 7;
        int[] arr = new int[n];
        int j = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                arr[j++] = i;
            }
        }

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                arr[j++] = i;
            }
        }
        System.out.println(arr[k-1]);
    }
}
