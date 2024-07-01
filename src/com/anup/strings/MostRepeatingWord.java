package com.anup.strings;

import java.util.*;

public class MostRepeatingWord {
    public static void main(String[] args) {
        String str = "Anup Anup Random";
        String[] arr = new String[str.length()];
        arr = str.split(" ");


        System.out.println(Arrays.toString(arr));

        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry mp: map.entrySet()){
            System.out.println(mp.getKey() + " = " + mp.getValue());
        }

        for(Map.Entry mp: map.entrySet()){
            System.out.println(mp.getKey() + " = " + mp.getValue());
        }
        System.out.println(map.entrySet().stream().findFirst().get());
    }

}
