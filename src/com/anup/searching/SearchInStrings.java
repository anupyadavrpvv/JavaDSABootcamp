package com.anup.searching;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Anup Yadav";
        char target = 'p';
        //System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if(str.length() == 0)
            return false;
        for (char ch :  str.toCharArray()) {
            if(ch == target)
                return true;
        }
        return false;
    }
}
