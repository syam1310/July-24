package org.july_24.heap;

public class KthLargestElements {
    public static int[] kLargest(int[] arr, int n, int k) {
        buildHeap(arr, n);

        int[] res = new int[k];
        int indx = 0;
        int i = 0;

        while (i < k) {
            res[indx++] = heapPop(arr, n - i);
            i++;
        }
        return res;
    }

    private static int heapPop(int[] arr, int n) {
        int max = arr[0];
        arr[0] = arr[n - 1];
        heapify(arr, n - 1, 0);
        return max;
    }

    private static void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
