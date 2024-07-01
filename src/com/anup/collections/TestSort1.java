package com.anup.collections;

import java.util.*;

class Student3 {
    int rollno;
    String name;
    int age;
    Student3(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class TestSort1{
  public static void main(String args[]){    
  ArrayList<Student3> al=new ArrayList<Student3>();
  al.add(new Student3(101,"Vijay",23));
  al.add(new Student3(106,"Ajay",27));
  al.add(new Student3(105,"Jai",21));

  Comparator<Student3> cm1=Comparator.comparing(Student3::getName);
   Collections.sort(al,cm1);  
   System.out.println("Sorting by Name");  
   for(Student3 st: al){
     System.out.println(st.rollno+" "+st.name+" "+st.age);  
     }  
   //Sorting elements on the basis of age  
    Comparator<Student3> cm2=Comparator.comparing(Student3::getAge);
Collections.sort(al,cm2);  
   System.out.println("Sorting by Age");  
   for(Student3 st: al){
     System.out.println(st.rollno+" "+st.name+" "+st.age);  
     }    
  }    
  }  