package com.company.util;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 24.07.2021.
 * Time: 19:16.
 */
public class Sorting {

    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        int length = list.size();
        for (int i = 1; i < length; i++) {
            T key = list.get(i); // Key is that element whose must compare another elements from unsorted array
            int j = i - 1; // J is index who moves in Array right to left and check is greater than key , and change the index greater element to smaller
            while (j >= 0 && (list.get(j).compareTo(key) < 0)) {
                list.set(j + 1, list.get(j)); // if true in list.get(i) index  element changed by list.get(i-1) index element
                j--;
            }
            list.set(j + 1, key); // list.get(i-1) index element's changed by smaller key , because list.get(i-1) > list.get(i) and key = list.get(i)
        }
    }

    public static <T extends Comparable<T>> void quickSort(List<T> list,int leftBorder,int rightBorder ) {
        int begin = leftBorder;
        int end = rightBorder;
        T pivot = list.get((begin + end) / 2);
        do {
            while (list.get(begin).compareTo(pivot) > 0) { // find grater element before pivot and fix it
                begin++;
            }
            while (list.get(end).compareTo(pivot) < 0) { // find less element after pivot and fix it
                end--;
            }
            if (begin <= end) {
                if (begin < end) { // if true doing swap between right side and left side arrays elements
                    swap(list, begin, end);
                }
                // Move Increments to get new borders for Do while cycle
                begin++;
                end--;
            }
        } while (begin <= end);
        // with recursion we do sorting after left or right increment reaches Arrays border
        if (begin < rightBorder) {
            quickSort(list, begin, rightBorder);
        }
        if (leftBorder < end) {
            quickSort(list, leftBorder, end);
        }
    }

    private static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
