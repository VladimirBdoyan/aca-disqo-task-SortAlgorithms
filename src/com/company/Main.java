package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {



        Random r = new Random();
        int array[] = new int[10001];
        int array1[] = new int[10001];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50);
            array1[i] =array[i];
        }
        // Insertion Sort Example
        InsertionSort insertionsort = new InsertionSort();
        System.out.println("Unsorted Array is");
        insertionsort.printArray(array);
        double start = System.nanoTime();
        insertionsort.insertionsort(array);
        double end = System.nanoTime();
        System.out.println();
        System.out.println("Sorted Array follow and time to spent for sort by Insertion Sort is " + (end-start)/1_000_000 + " milliseconds");
        insertionsort.printArray(array);

        // Quick Sort Example
        QuickSort quickSort = new QuickSort();
        System.out.println();
        System.out.println("Unsorted Array is");
        quickSort.printArray(array1);
        start = System.nanoTime();
        quickSort.quickSort(array1, 0, array1.length - 1);
        end = System.nanoTime();
        System.out.println();
        System.out.println("Sorted Array follow and time to spent for sort by Quick Sort is " + (end-start)/1_000_000 + " milliseconds");
        quickSort.printArray(array1);


    }
}
