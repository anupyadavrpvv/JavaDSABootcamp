package com.anup.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(100,"Amit");
        map.put(101,"Sen");
        map.put(102,"Gupta");
        map.put(104,"Random");
        map.putIfAbsent(105,"Singh");
        System.out.println(":::Map:::");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(":::comparingByKey:::");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println(":::comparingByKey in ReverseOrder:::");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
