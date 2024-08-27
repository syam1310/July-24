package org.july_24.heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    public void minHeapify(List<Integer> array, int i) {
        int size = array.size();
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if (left < size && array.get(left) < array.get(i)) {
            smallest = left;
        }
        if (right < size && array.get(right) < array.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = array.get(i);
            array.set(i, array.get(smallest));
            array.set(smallest, temp);

            minHeapify(array, smallest);
        }
    }

    public void insert(List<Integer> array, int newNum) {
        if (array.size() == 0) {
            array.add(newNum);
        } else {
            array.add(newNum);

            for (int i = array.size() / 2 - 1; i >= 0; i--) {
                minHeapify(array, i);
            }
        }
    }

    public int heapPop(List<Integer> array) {
        if (array.size() < 1) return -1;
        int min = array.get(0);
        array.set(0, array.get(array.size() - 1));
        array.remove(array.size() - 1);
        minHeapify(array, 0);
        return min;
    }

    public void deleteNode(List<Integer> arrray, int num) {
        if (arrray.size() < 1) return;

        int i = 0;
        for (i = 0; i < arrray.size(); i++) {
            if (num == arrray.get(i)) break;
        }

        int temp = arrray.get(i);
        arrray.set(i, arrray.get(arrray.size() - 1));
        arrray.set(arrray.size() - 1, temp);

        for (int j = arrray.size() / 2 - 1; j >= 0; j--) {
            minHeapify(arrray, j);
        }
    }

    public void increaseKey(List<Integer> array, int i, int key) {
        if (key < array.get(i)) return;

        array.set(i, key);

        minHeapify(array, i);
    }

    public void decreaseKey(List<Integer> array, int i, int key) {
        if (key > array.get(i)) return;

        array.set(i, key);

        while (i > 0 && array.get(i / 2) > array.get(i)) {
            int temp = array.get(i);
            array.set(i, array.get(i / 2));
            array.set(i / 2, temp);

            i /= 2;
        }
    }
    public List<Integer> heapSort(List<Integer> array){
        if(array.size() == 0)return array;
        List<Integer> sortedArray = new ArrayList<>();

        while (!array.isEmpty()){
            sortedArray.add(heapPop(array));
        }
        return sortedArray;
    }
}
