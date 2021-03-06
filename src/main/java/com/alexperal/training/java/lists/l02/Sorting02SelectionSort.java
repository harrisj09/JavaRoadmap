package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;

import java.util.Arrays;

/**
 * Sorts using the bubble sort algorithm.
 *
 * Finds the min element in the list and places it at the begging of it
 * Repeats for each position until the end
 *
 * https://en.wikipedia.org/wiki/Selection_sort
 */
public class Sorting02SelectionSort implements Sorting00Sorter {

    @Override
    public MinimalIntList sort(MinimalIntList list) {
        if(list.isEmpty() || list.length() == 1) {
            return list;
        }
        int currentMin;
        int currentMinIndex = 0;
        for(int i = 0; i < list.length() - 1; i++) {
            currentMin = list.get(i);
            for(int j = i + 1; j < list.length(); j++) {
                if(list.get(j) < currentMin) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, currentMin);
            list.set(currentMinIndex, temp);
        }
        return list;
    }
}