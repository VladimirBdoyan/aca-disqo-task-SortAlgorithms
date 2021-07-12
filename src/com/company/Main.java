package com.company;


import com.company.util.SortingUtil;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int array[] = new int[101];
        int array1[] = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50);
            array1[i] = array[i];
        }
        // Insertion Sort Example

        System.out.println("Unsorted Array is");
        SortingUtil.printArray(array);
        double start = System.nanoTime();
        SortingUtil.insertionsort(array);
        double end = System.nanoTime();
        System.out.println();
        System.out.println("Sorted Array follow and time to spent for sort by Insertion Sort is " + (end - start) / 1_000_000 + " milliseconds");
        SortingUtil.printArray(array);

        // Quick Sort Example
        System.out.println();
        System.out.println("Unsorted Array is");
        SortingUtil.printArray(array1);
        start = System.nanoTime();
        SortingUtil.quickSort(array1, 0, array1.length - 1);
        end = System.nanoTime();
        System.out.println();
        System.out.println("Sorted Array follow and time to spent for sort by Quick Sort is " + (end - start) / 1_000_000 + " milliseconds");
        SortingUtil.printArray(array1);
    }
}
