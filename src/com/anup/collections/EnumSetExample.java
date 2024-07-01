package com.anup.collections;

import java.net.DatagramSocket;
import java.util.*;

enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FIRIDAY, SATURDAY
        }

public class EnumSetExample {
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.MONDAY, days.SATURDAY);
        Iterator<days> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<days> set2 = EnumSet.allOf(days.class);
        System.out.println(set2);
        Set<days> set3 = EnumSet.noneOf(days.class);
        System.out.println(set3);

        //EnumMap
        EnumMap<days, String> enumMap = new EnumMap<days, String>(days.class);
        enumMap.put(days.MONDAY, "1");
        enumMap.put(days.TUESDAY, "2");
        enumMap.put(days.WEDNESDAY, "3");
        for(Map.Entry map : enumMap.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
