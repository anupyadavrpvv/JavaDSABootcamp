package com.anup.recursion;

public class ReverseNumber {
    static int sum = 0;
    public static void main(String[] args) {
//        reverseOfNumber(234);
//        System.out.println(sum);
        //using helper method
        System.out.println(reverseOfNumber2(1234));
    }
    //using a external variable sum
    private static void reverseOfNumber(int n) {
        if(n == 0)
            return;
        int rem = n%10;
        sum = sum * 10 +rem;
        reverseOfNumber(n/10);
    }

    //using another helper method
    private static int reverseOfNumber2(int n) {
        int digits = (int)(Math.log10(n)+1);
        return helperMethod(n,digits);
    }

    private static int helperMethod(int n, int digits) {
        if(n%10 == n){
            return n;
        }

        return  n%10 * (int)(Math.pow(10,digits-1)) + helperMethod(n/10, digits-1);
    }
}
