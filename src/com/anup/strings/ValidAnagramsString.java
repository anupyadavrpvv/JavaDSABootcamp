package com.anup.strings;

public class ValidAnagramsString {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("ac", "bb"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (char x : s.toCharArray()) {
            arr[x-'a']++;
        }
        for (char x : t.toCharArray()) {
            arr[x-'a']--;
        }
        for (int j : arr) {
            if (j != 0) return false;
        }
        return true;
    }
}
