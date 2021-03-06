package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sorting01BubbleSortTest {

    private Sorting00Sorter sorter;

    @BeforeEach
    public void initBeforeTest() {
        sorter = new Sorting04MergeSort();
    }

    @Test
    public void sortEmptyList() {
        MinimalIntList list = new MyList();
        //sort(MinimalIntList list)
    }

    @Test
    public void unsortedList() {
        MinimalIntList list = new MyList();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        assertFalse(sorter.isSorted(list));
    }

    @Test
    public void singleList() {
        //sort(MinimalIntList list)
    }

    @Test
    public void regularList() {
        MinimalIntList list = new MyList();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        MinimalIntList sortedList = sorter.sort(list);
        assertTrue(sorter.isSorted(sortedList));
        // lists that contains negatives, duplicates, list even in size, list odd in size
    }
}