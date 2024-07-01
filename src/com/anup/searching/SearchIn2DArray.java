package com.anup.searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(findMin(arr));
    }
    static int[] search(int[][] arr, int target){
        if(arr.length < 0)
            return new int[]{-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    static int findMin(int[][] arr){
        if(arr.length < 0){
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }

}
