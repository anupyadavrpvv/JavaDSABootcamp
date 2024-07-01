package com.anup.threading;
/*In this example we have used synchronized keyword
 on the static method to perform static synchronization.*/
class TableStaticSynchronized {
 synchronized static void printTable(int n){    
   for(int i=1;i<=10;i++){    
     System.out.println(n*i);    
     try{    
       Thread.sleep(400);    
     }catch(Exception e){}    
   }    
 }    
}    
class MyThread11 extends Thread{
public void run(){
    TableStaticSynchronized.printTable(1);
}    
}    
class MyThread12 extends Thread{
public void run(){
    TableStaticSynchronized.printTable(10);
}    
}    
class MyThread13 extends Thread{
public void run(){
    TableStaticSynchronized.printTable(100);
}    
}    
class MyThread14 extends Thread{
public void run(){
    TableStaticSynchronized.printTable(1000);
}    
}    
public class TestSynchronization4{    
    public static void main(String t[]){
        MyThread11 t1=new MyThread11();
        MyThread12 t2=new MyThread12();
        MyThread13 t3=new MyThread13();
        MyThread14 t4=new MyThread14();
        t1.start();    
        t2.start();
        t3.start();
        t4.start();
    }
} 