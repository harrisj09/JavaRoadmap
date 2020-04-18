package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;

/**
 * Splits the array in two and sorts each part
 * <p>
 * Then uses the two sorted arrays to merge them into the final one
 * <p>
 * https://en.wikipedia.org/wiki/Merge_sort
 */
public class Sorting04MergeSort implements Sorting00Sorter {


    @Override
    public MinimalIntList sort(MinimalIntList list) {
        // base case
        if (list.isEmpty() || list.length() == 1) {
            return list;
        }
        /*
            Store two lists that have are the size the lists width
         */
        MinimalIntList list1 = new MyList();
        MinimalIntList list2 = new MyList();
        for (int i = 0; i < list.length(); i++) {
            /*
                nextListToAdd returns a list to use for .add method
                its really returning that array lists pointer
             */
            nextListToAdd(list1, list2, i).add(list.get(i));
        }
        /*
            Uses bubble sort to sort them
         */
        list1 = sort(list1);
        list2 = sort(list2);
        for (int i = 0; i < list.length(); i++) {
            /*
                nextListToRemove returns the pointer list
                .remove returns the index to set it to
                and removes the first index from the list

             */
            list.set(i, nextListRemove(list1, list2).remove(0));
        }
        return list;
    }

    /*
        These are both divide and conquer
     */
    public static MinimalIntList nextListToAdd(MinimalIntList list1, MinimalIntList list2, int index) {
        /*
        Array size always has an equal amount of even and odd indexes
         */
        if (index % 2 == 0) {
            return list1;
        }
        return list2;
    }

    public static MinimalIntList nextListRemove(MinimalIntList list1, MinimalIntList list2) {
        /*
        Checks if they're empty
         */
        if(list1.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }
        /*
        Always return the smallest number
         */
        if(list1.get(0) < list2.get(0)) {
            return list1;
        }
        return list2;
    }
}