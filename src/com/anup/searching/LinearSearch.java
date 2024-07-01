package com.anup.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,42,4,6,1,64,5, 24, 53};
        int target = 41;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
