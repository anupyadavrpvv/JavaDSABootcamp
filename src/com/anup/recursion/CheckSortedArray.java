package com.anup.recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 6, 8};
        System.out.println(isArraySorted(arr, 0));
    }

    private static boolean isArraySorted(int[] arr, int i) {
        if(i == arr.length-1)
            return true;
        return arr[i]<=arr[i+1] && isArraySorted(arr, i+1);
    }
}
