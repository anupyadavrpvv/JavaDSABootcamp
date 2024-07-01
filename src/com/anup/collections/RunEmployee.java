package com.anup.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
     Integer id;
     String name;
     String Address;

    public Employee(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    @Override
    public int compareTo(Employee o) {
        if( id < o.id)
            return -1;
        else if(id > o.id ){
            return 1;
        }else{
            return 0;
        }
    }

}

public class RunEmployee{
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(103, "Anup", "Delhi"));
        list.add(new Employee(101, "Anup", "Delhi"));
        list.add(new Employee(102, "Anup", "Delhi"));

        //Collections.sort(list, new IdComparator());
        Collections.sort(list);


        for( Employee emp:list){
            System.out.println(emp.id );
        }
    }
}
class IdComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.id > o2.id)
            return 1;
        else if(o1.id < o2.id){
            return -1;
        }else{
            return 0;
        }
    }
}
