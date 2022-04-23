
package com.anup.sorting.quetions;

import java.util.ArrayList;
import java.util.List;

class FindAllDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<nums.length) {
            if(nums[i] != nums[nums[i]-1]) {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
}