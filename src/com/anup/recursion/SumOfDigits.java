package com.anup.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsOfNumber(1234));
    }

    private static int sumOfDigitsOfNumber(int n) {
        if(n == 0) {
            return 0;
        }
        return n%10 + sumOfDigitsOfNumber(n/10);

    }
}
