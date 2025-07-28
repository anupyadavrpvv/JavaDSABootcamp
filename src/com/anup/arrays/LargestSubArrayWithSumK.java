package com.anup.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[]{-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, arr.length, 15));
    }

    public static int lenOfLongSubarr (int A[], int N, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum == K){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - K;
            if(map.containsKey(rem)){
               int len = i-map.get(rem);
               maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum))
                map.put(sum, i);
        }
        return maxLen;
    }
}
