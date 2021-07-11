package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.07.2021.
 * Time: 10:38.
 */
public class QuickSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    protected void quickSort(int[] arr, int leftBorder, int rightBorder) {
        int left = leftBorder; // left increment
        int right = rightBorder; // right increment
        int pivot = arr[(left + right) / 2]; // support element by which can find smaller and bigger element than that
        // we can choose the pivot first or last element , but have a chance
        // that elements is smaller or bigger element in array and that time this method not more effective
        do {
            while (arr[left] < pivot) { // find grater element before pivot and fix it
                left++;
            }
            while (arr[right] > pivot) { // find less element after pivot and fix it
                right--;
            }
            if (left <= right) {
                if (left < right) { // if true doing swap between right side and left side arrays elements
                    swap(arr, left, right);
                }
                // Move Increments to get new borders for Do while cycle
                left++;
                right--;
            }
        } while (left <= right);
        // with recursion we do sorting after left or right increment reaches Arrays border
        if (left < rightBorder) {
            quickSort(arr, left, rightBorder);
        }
        if (leftBorder < right) {
            quickSort(arr, leftBorder, right);
        }
        // Time Complexity in best Case O(nLogn) and average Case is also O(nLogn) , but worst Case O(n^2)
        // if pivot is every time will be bigger or lesser element in the array
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
