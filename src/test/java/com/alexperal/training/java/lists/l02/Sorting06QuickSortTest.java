package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sorting06QuickSortTest {
    @Test
    public void sortEmptyList() {
        MinimalIntList list = new MyList();
        //sort(MinimalIntList list)
    }

    @Test
    public void unsortedList() {
        MinimalIntList list = new MyList();
        Sorting00Sorter quickSort = new Sorting06QuickSort();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        assertFalse(quickSort.isSorted(list));
    }

    @Test
    public void singleList() {
        //sort(MinimalIntList list)
    }

    @Test
    public void regularList() {
        MinimalIntList list = new MyList();
        Sorting00Sorter quickSort = new Sorting06QuickSort();
        list.add(6);
        list.add(10);
        list.add(13);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(11);
        MinimalIntList sortedList = quickSort.sort(list);
        for (int i = 0; i < sortedList.length(); i++) {
            System.out.println(sortedList.get(i));
        }
        assertTrue(quickSort.isSorted(sortedList));
    }
}