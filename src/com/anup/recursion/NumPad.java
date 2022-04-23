package com.anup.recursion;

import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
//        numPadTyping("", "12");
        System.out.println(numPadTypingList("", "18"));
    }

    static void numPadTyping(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a'+ i);
            numPadTyping(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> numPadTypingList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a'+ i);
            ans.addAll(numPadTypingList(p+ch, up.substring(1)));
        }
        return ans;
    }
}
