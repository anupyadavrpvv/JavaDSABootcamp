package com.anup.recursion;

public class Nto1 {
    public static void main(String[] args) {
        funRev(5);
    }

    //concept --n  vs  n--
    static void concept(int n){
        if(n == 0){
            return;
        }
        //n-- will create stackoverflow error
        //because it passes the value of n then subtract it after
//        concept(n--);
        //it will run normally because
        //--n first subtracts n and then passes it
        concept(--n);
    }

    //it will print then call
    static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    //it will call the next function wait for its execution and then
    //print the number
    static void funRev(int n){
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
