package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;

import java.util.List;

/**
 * Randomly chooses a pivot, and puts all the elements of the list at the left that are less than the pivot and all the
 * ones that are greater at the right, repeats it for each one of the two sections until the size of the list is 1
 * <p>
 * https://en.wikipedia.org/wiki/Quicksort
 */
public class Sorting06QuickSort implements Sorting00Sorter {


    @Override
    public MinimalIntList sort(MinimalIntList list) {
        quicksort(list, 0, list.length());
        return list;
    }

    private MinimalIntList quicksort(MinimalIntList list, int low, int high) {
        if(high - low > 1) {
            int pivot = partition(list, low, high);
            quicksort(list, low, pivot);
            quicksort(list, pivot + 1, high);
        }
        return list;
    }

    private int partition(MinimalIntList list, int low, int high) {
        int pivotValue = list.get(low);
        int pivotIndex = low;
        for (int i = low + 1; i < high; i++) {
            if(list.get(i) < pivotValue) {
                pivotIndex++;
                swap(list, pivotIndex, i);
            }
        }
        swap(list, low, pivotIndex);
        return pivotIndex;
    }

    private MinimalIntList swap(MinimalIntList list, int pivotIndex, int swapIndex) {
        int temp = list.get(pivotIndex);
        list.set(pivotIndex, list.get(swapIndex));
        list.set(swapIndex, temp);
        return list;
    }
}