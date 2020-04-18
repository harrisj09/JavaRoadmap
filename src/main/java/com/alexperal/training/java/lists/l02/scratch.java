package com.alexperal.training.java.lists.l02;

import java.util.Arrays;
import java.util.Random;

public class scratch {

    public static void main(String[] args) {
        int[] A = {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
        System.out.println(Arrays.toString(A));
        quickSort(A);
        System.out.println(Arrays.toString(A));
    }

    // Pass it to this to start the quicksort
    public static void quickSort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    public static void quickSort(int[] A, int low, int high) {
        // if array size ist equal to one
        if (low < high + 1) {
            int p = partition(A, low, high);
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);
        }
    }

    // moves all n < pivot to left of pivot and all n > pivot
    // to right of pivot, then returns pivot index.
    private static int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border-1);
        return border-1;
    }

    private static void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    // returns random pivot index between low and high inclusive.
    private static int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }
}