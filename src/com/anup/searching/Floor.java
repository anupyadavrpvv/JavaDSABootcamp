package com.anup.searching;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-18, -9, -4, 0, 1, 2, 4 , 6, 9, 19, 70};
        int target = -7;
        System.out.println("Floor of "+target+" is at index = "+binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target){
        if(target <= arr[0])
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target)
                start = mid + 1;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
        return end;
    }
}
