package org.july_24.heap;

import java.util.ArrayList;

public class MaxHeap {
    public void heapify(ArrayList<Integer> ht, int i){
        int size = ht.size();
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && ht.get(left) > ht.get(i)){
            largest = left;
        }
        if(right < size && ht.get(right) > ht.get(largest)){
            largest = right;
        }

        if(largest != i){
            int temp = ht.get(largest);
            ht.set(largest, ht.get(i));
            ht.set(i, temp);

            heapify(ht, largest);
        }
    }
    public void insert(ArrayList<Integer> ht, int newNum){
        if(ht.size() == 0){
            ht.add(newNum);
        }else{
            ht.add(newNum);
//            int i = ht.size()-1;
//
//            while (i > 1 && ht.get(i/2) < ht.get(i)){
//                int temp = ht.get(i/2);
//                ht.set(i/2, ht.get(i));
//                ht.set(i, temp);
//
//                i /= 2;
//            }

            for(int i= ht.size()/2-1; i>=0; i--){
                heapify(ht, i);
            }
        }
    }
    public void deleteNode(ArrayList<Integer> ht, int num){
        int size = ht.size();
        int i = 0;
        for(i = 0; i<size; i++){
            if(num == ht.get(i)){
                break;
            }
        }
        int temp = ht.get(i);
        ht.set(i, ht.get(size-1));
        ht.set(size-1, temp);

        ht.remove(size-1);

        for(int j=size/2-1; j>=0; j--){
            heapify(ht, j);
        }
    }
    public void increaseKey(ArrayList<Integer> array, int i, int key){
        if(key < array.get(i))return;
        array.set(i, key);
        while (i > 0 && array.get(i/2) < array.get(i)){
            int temp = array.get(i);
            array.set(i, array.get(i/2));
            array.set(i/2, temp);

            i /= 2;
        }
    }

    public int heapPop(ArrayList<Integer> array){
        if(array.size() < 1) return -1;
        int max = array.get(0);
        array.set(0, array.get(array.size()-1));
        array.remove(array.size()-1);
        //array.set(array.size()-1, max);
        heapify(array, 0);
        return max;
    }

    public void decreaseKey(ArrayList<Integer> array, int i, int key){
        if(key > array.get(i))return;

        array.set(i, key);

        heapify(array, i);
    }
    public ArrayList<Integer> heapSort(ArrayList<Integer> array){
        if(array.size() == 0)return array;
        ArrayList<Integer> sortedArray = new ArrayList<>();

        while (!array.isEmpty()){
            sortedArray.add(heapPop(array));
        }
        return sortedArray;

    }
}
