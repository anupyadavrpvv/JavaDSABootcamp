package com.anup.arrays;

import java.util.Arrays;

public class FindTheMissingNo {
    public static void main(String[] args) {
        int []nums = new int[]{3,0,1,2};
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        System.out.println(((n*(n+1))/2)-sum);
    }
}
