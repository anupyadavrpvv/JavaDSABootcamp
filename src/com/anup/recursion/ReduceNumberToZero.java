package com.anup.recursion;

public class ReduceNumberToZero {
    public static void main(String[] args) {
        System.out.println(reduceNumberToZero(14));
    }

    public static int reduceNumberToZero(int n) {
//        return helper(n, 0);
        //without using helper method
        if(n == 0)
            return 0;
        return n%2 == 0 ? 1 + reduceNumberToZero(n/2): 1 + reduceNumberToZero(n-1);
    }
    //using a helper method
    private static int helper(int n, int steps) {
        if(n == 0)
            return steps;
        return n%2 == 0 ? helper(n/2,steps+1):helper(n-1,steps+1);
    }


}
