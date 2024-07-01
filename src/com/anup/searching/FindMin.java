package com.anup.searching;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 3, 43, 67, -6, 89, 5, 12};

        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int a :
                arr) {
            if (a < min){
                min = a;
            }
        }
        return min;
    }
}
