package com.anup.sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i=0;
        while(i < arr.length) {
            if(arr[i] != arr[arr[i]-1]) {
//                int temp = arr[i];
//                arr[i] = arr[arr[i]-1];
//                arr[temp-1]=temp;
                swap(arr, i, arr[i]-1);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
