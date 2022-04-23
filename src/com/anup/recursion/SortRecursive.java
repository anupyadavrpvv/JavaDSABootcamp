package com.anup.recursion;

public class SortRecursive {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
//        bubbleSortRecursive(arr, arr.length-1, 0);
//        printArray(arr);
        //calling selection sort
        selectionSortRecursive(arr, arr.length, 0, 0);
        printArray(arr);
    }

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
    private static void bubbleSortRecursive(int[] arr, int r, int c) {
        if(r == 0)
            return;
        if(c<r) {
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSortRecursive(arr, r,c+1);
        }else{
            bubbleSortRecursive(arr, r-1, 0);
        }

    }

    //selection sort
    private static void selectionSortRecursive(int[] arr, int r, int c, int max) {
        if(r == 0)
            return;

        if(c<r){
            if(arr[c] > arr[max]) {
                selectionSortRecursive(arr, r, c+1, c);
            }else {
                selectionSortRecursive(arr, r, c+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSortRecursive(arr, r-1, 0, 0);
        }

    }
}
