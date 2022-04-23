package com.anup.recursion.stringProblems;

public class Skip {
    public static void main(String[] args) {
//        System.out.println(skipChar("anup"));
//        System.out.println(skipApple("pineapple"));
        System.out.println(skipAppIfNotApple("pineappleapp"));
    }

    static String skipChar(String str) {
        if(str.isEmpty()){
            return str;
        }
        char ch = str.charAt(0);
        if(ch == 'a') {
            return skipChar(str.substring(1));
        }
        return ch + skipChar(str.substring(1));
    }

    static String skipApple(String str) {
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("apple")) {
            return skipApple(str.substring(5));
        }
        return str.charAt(0) + skipApple(str.substring(1));
    }

    static String skipAppIfNotApple(String str) {
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppIfNotApple(str.substring(3));
        }
        return str.charAt(0) + skipAppIfNotApple(str.substring(1));
    }

}
