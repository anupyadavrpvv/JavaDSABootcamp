package com.anup.sorting.quetions;

class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,3,2,5,1};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length) {
            if(nums[i] != i+1) {
                if(nums[i] != nums[nums[i]-1]){
                    swap(nums, i, nums[i]-1);
                }else{
                    return nums[i];
                }
            }else {
                i++;
            }

        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != i+1){
                return nums[index];
            }
        }
        return -1;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}