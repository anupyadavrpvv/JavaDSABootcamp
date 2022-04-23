package com.anup.recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(2010110));
    }

    private static int countZeroes(int n) {
//        return helper(n, 0);
        if(n == 0 ){
            return 0;
        }
//        if(n%10 == 0)
//            return helper(n/10, c+1);
//        return helper(n/10, c);
        return n%10 ==0 ? 1+countZeroes(n/10):countZeroes(n/10);
    }

    private static int helper(int n, int c) {
        if(n == 0 ){
            return c;
        }
//        if(n%10 == 0)
//            return helper(n/10, c+1);
//        return helper(n/10, c);
        return n%10 ==0 ? helper(n/10, c+1):helper(n/10, c);
    }
}
