package com.anup.threading;

public class GarbaseCollectionExample {
    public void finalize(){System.out.println("object is garbage collected");}
    public static void main(String args[]){
        GarbaseCollectionExample s1=new GarbaseCollectionExample();
        GarbaseCollectionExample s2=new GarbaseCollectionExample();
        s1=null;
        s2=null;
        System.gc();
    }
}
