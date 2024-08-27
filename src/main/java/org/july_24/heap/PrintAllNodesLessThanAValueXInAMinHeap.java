package org.july_24.heap;

public class PrintAllNodesLessThanAValueXInAMinHeap {


    public void printSmallerThanValueX(int[] arr, int x, int pos) {
        if (pos >= arr.length) return;
        if (arr[pos] >= x) return;

        System.out.print(arr[pos] + " ");

        printSmallerThanValueX(arr, x, 2 * pos + 1);
        printSmallerThanValueX(arr, x, 2 * pos + 2);
    }

    public void insertKey(int[] arr, int key, int size) {
        if (size >= arr.length) {
            throw new IllegalArgumentException("Heap is full, cannot insert key.");
        }

        int i = size;
        arr[i] = key;
        size++;

        while (i > 0 && arr[(i - 1) / 2] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[(i - 1) / 2];
            arr[(i - 1) / 2] = temp;

            i = (i - 1) / 2;
        }
    }
}
