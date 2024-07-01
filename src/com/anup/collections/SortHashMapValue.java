package com.anup.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortHashMapValue {
    public static void main(String[] args) {
//implementing HashMap  
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(6, "Tushar");
        hm.put(12, "Ashu");
        hm.put(5, "Zoya");
        hm.put(78, "Yash");
        hm.put(10, "Praveen");
        hm.put(67, "Boby");
        hm.put(1, "Ritesh");
        System.out.println("Before Sorting:");
        for (Map.Entry mp : hm.entrySet()) {
            System.out.println("Roll no:  "+ mp.getKey() + "     Name:    "+ mp.getValue());
        }
        Map<Integer, String> map = sortValues(hm);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.println("Roll no:  " + me2.getKey() + "     Name:   " + me2.getValue());
        }
    }

    //method to sort values
    private static HashMap sortValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
//Custom Comparator  
        Collections.sort(list, (Comparator) (o1, o2) -> ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue()));
//copying the sorted list in HashMap to preserve the iteration order  
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
} 