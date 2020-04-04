package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;

/**
 * Randomly chooses a pivot, and puts all the elements of the list at the left that are less than the pivot and all the
 * ones that are greater at the right, repeats it for each one of the two sections until the size of the list is of size 12, then it uses insertion sort
 * <p>
 * https://en.wikipedia.org/wiki/Quicksort
 */
public class Sorting07EnhancedQuickSort implements Sorting00Sorter {


    @Override
    public MinimalIntList sort(MinimalIntList list) {

        return list;
    }

    @Override
    public boolean isSorted(MinimalIntList list) {
        return false;
    }
}
