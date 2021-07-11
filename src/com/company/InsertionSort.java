package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.07.2021.
 * Time: 16:22.
 */
public class InsertionSort {
    // Function to sort array using insertion sort
    void insertionsort(int array[]) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int key = array[i]; // Key is that element whose must compare another elements from unsorted array
            int j = i - 1; // J is index who moves in Array right to left and check is greater than key , and change the index greater element to smaller
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // if true in array[i] index  element changed by array{i-1] index element
                j--;
            }
            array[j + 1] = key; // array[i-1] index element's changed by smaller key , because array[i-1] > array[i] and key = array[i]
        }
    }
    // Time Complexity O(n^2) , if array already Sorted in the opposite direction then Time Complexity is the worst
     void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
