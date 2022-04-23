package com.anup.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 14, 7, 1, 3};
//        selectionSort(arr);
//        selectionSortInplace(arr);
        selectionSort3(arr);
        System.out.println(Arrays.toString(arr));
    }
    //in this approach we are finding the minimum element and putting it in another array
    //this is naive approach which uses extra space i.e. O(n) and takes O(n^2)
    static void selectionSort(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int minIndex= 0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    
    //in this approach we are finding the smallest element and then replacing it with the
    //starting element which is greater 
    //In-place approach O(n)
    static void selectionSortInplace(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    //in this approach we are finding the maximum approach and replacing it with the
    //element present in the end which is not sorted
    static void selectionSort3(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            int maxIndex = arr.length - i -1;
            for (; j < arr.length-i-1; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[j];
            arr[j] = temp;
        }
    }
}
