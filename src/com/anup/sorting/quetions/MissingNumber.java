package com.anup.sorting.quetions;
/*
    find the one missing number between 0-N
*/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,3,4,2};
        System.out.println(missingNumber(arr));
    }
    //using cyclic sort
    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length) {
            if(arr[i] < arr.length && arr[i] != i) {
                swap(arr, i, arr[i]);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //another approach
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int target = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }
        return target - sum;
    }
}
