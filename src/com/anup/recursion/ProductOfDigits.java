package com.anup.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigitsOfNumber(10234));
    }

    private static int productOfDigitsOfNumber(int n) {
        if ( n%10 == n)
            return n;
        return n%10 * productOfDigitsOfNumber(n/10);
    }
}
