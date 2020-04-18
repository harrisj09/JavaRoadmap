package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;

/**
 * Starts at the first index and leaves it in place.
 *
 * Checks if number is bigger than it. If it is then move it
 * to the left until its false or reaches index 0.
 *
 * https://en.wikipedia.org/wiki/Insertion_sort
 */
public class Sorting03InsertionSort implements Sorting00Sorter{


    @Override
    public MinimalIntList sort(MinimalIntList list) {
        if(list.length() <= 1) {
            return list;
        }
        for(int i = 0; i < list.length(); i++) {
            if (i != 0 && list.get(i) < list.get(i - 1)) {
                int counter = i;
                while(counter != 0 && list.get(counter) < list.get(counter - 1)) {
                    if(list.get(counter) < list.get(counter - 1)) {
                        int temp = list.get(counter);
                        list.set(counter, list.get(counter - 1));
                        list.set(counter - 1, temp);
                        counter--;
                    }
                }
            }
        }
        return list;
    }
}