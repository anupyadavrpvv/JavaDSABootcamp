package com.anup.searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 3, 43, 67, 6, 89, 5, 12};
        int target = 12;
        System.out.println(linearSearch(arr, target, 3, 5));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0)
            return -1;
        for(int i =start; i<end; i++){
            if(target == arr[i])
                return i;
        }
        return -1;
    }
}
