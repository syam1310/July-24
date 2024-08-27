package org.july_24.heap;

public class HeapSortDesc {
    public static void sort(int[] arr, int n){
        buildHeap(arr, n);

        for(int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);

        }
    }
    private static void heapify(int[] arr, int n, int i){
        int left  = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if(left < n && arr[left] < arr[smallest]){
            smallest = left;
        }
        if(right < n && arr[right] < arr[smallest]){
            smallest = right;
        }

        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }
    private static void buildHeap(int[] arr, int n){
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
    }
}
