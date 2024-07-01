package com.anup.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
    int rollno;
    String name;
    int age;

    public Student2(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student2>{

    @Override
    public int compare(Student2 s1, Student2 s2) {
        if(s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2(101, "Amar", 23));
        list.add(new Student2(102, "Akbar", 27));
        list.add(new Student2(103, "Enthony", 21));
        System.out.println("Sorting By Name:");
        Collections.sort(list, new NameComparator());
        for(Student2 st:list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("Sorting By Age:");
        Collections.sort(list, new AgeComparator());
        for(Student2 st:list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
