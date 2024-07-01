package com.anup.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//making an ArrayList synchronized(by default ArrayList is non-synchronized)
public class SyncronizeArrayList {
    public static void main(String args[]) {  
        // Non Synchronized ArrayList   
        List<String> fruitList = new ArrayList<>();
  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
  
        // Synchronizing ArrayList in Java  
        fruitList = Collections.synchronizedList(fruitList);
  
        // we must use synchronize block to avoid non-deterministic behavior  
        synchronized (fruitList) {
            Iterator<String> itr = fruitList.iterator();
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
        }
    }  
}  