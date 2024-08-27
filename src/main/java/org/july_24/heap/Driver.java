package org.july_24.heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        //MaxHeap maxHeap = new MaxHeap();
        //int[] arr = {12, 11, 13, 5, 6, 7};
        /*for(int i : arr){
            maxHeap.insert(array, i);
        }

        System.out.println(array);

        //maxHeap.deleteNode(array, 6);

        maxHeap.increaseKey(array, 3, 8);

        System.out.println(array);

        maxHeap.decreaseKey(array, 2, -1);

        System.out.println(array);

        //System.out.println(maxHeap.heapPop(array));

        System.out.println(array);

        System.out.println(maxHeap.heapSort(array));*/

        /*MinHeap minHeap = new MinHeap();
        for(int i : arr)
            minHeap.insert(array, i);

        System.out.println(array);

        //System.out.println(minHeap.heapPop(array));

        //minHeap.deleteNode(array, 5);

        minHeap.increaseKey(array, 2, 10);
        minHeap.decreaseKey(array, 2, 5);
        //System.out.println(minHeap.heapSort(array));

        System.out.println(array);*/

//        HeapSort heapSort = new HeapSort();
//        heapSort.heapSort(arr);
//        System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(KthLargestElements.kLargest(arr, arr.length, 2)));

        //System.out.println(KthSmallestElement.kthSmallest(arr, arr.length, 2));
        //System.out.println(HeightOfHeapBt.height(8));

//        HeapSortDesc.sort(arr, arr.length);
//
//        System.out.println(Arrays.toString(arr));

        /*int heapSize = 5;
        int[] heap = new int[heapSize];
        int currentSize = 0;
        PrintAllNodesLessThanAValueXInAMinHeap heapUtil = new PrintAllNodesLessThanAValueXInAMinHeap();

        // Insert some elements into the heap
        heapUtil.insertKey(heap, 3, currentSize++);
        heapUtil.insertKey(heap, 5, currentSize++);
        heapUtil.insertKey(heap, 7, currentSize++);
        heapUtil.insertKey(heap, 2, currentSize++);
        heapUtil.insertKey(heap, 4, currentSize++);

        int x = 6;

        heapUtil.printSmallerThanValueX(heap, x, 0);

        System.out.println(Arrays.toString(heap));*/

        /*int[] arr1 = {4, 3, 2, 6};
        System.out.println(ConnectRopes.minCost(arr1, arr1.length));*/

//        int[][] grid = {{58, 42, 8, 75, 28}, {35, 21, 13, 21, 72}};
//        System.out.println(DeleteGreatestValueInEachRow.deleteGreatestValue(grid));

//        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0,0,0},{1, 1, 0,0,0}, {1, 1, 1, 1, 1}};
//
//        TheKWeakestRowsInAMatrix.kWeakestRows(mat, 3);

//        int[] arr = {1,5,0,3,5};
//        System.out.println(MakeArrayZeroBySubtractingEqualAmounts.minimumOperations(arr));

//        int[] scores = {10,3,8,9,4};
//        System.out.println(Arrays.toString(RelativeRanks.findRelativeRanks(scores)));


//        int[] stones ={2,7,4,1,8,1};
//        System.out.println(LastStoneWeight.lastStoneWeight(stones));

        int num = 65875;
        System.out.println(LargestNumberAfterDigitSwapsByParity.largestInteger(num));
    }
}
