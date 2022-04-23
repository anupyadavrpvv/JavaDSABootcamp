package com.anup.recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sumofn(5));
    }

    private static int sumofn(int n) {
        if(n <= 1 ) {
            return 1;
        }
        return n + sumofn(n-1);
    }
}
