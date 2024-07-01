package com.anup.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }
}

public class TestComparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Vijay", 23));
        list.add(new Student(102, "Ajay", 27));
        list.add(new Student(103, "Jay", 21));
        Collections.sort(list);
        for (Student st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("Sorting in reverse order:");
        Collections.sort(list, Collections.reverseOrder());
        for(Student st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
