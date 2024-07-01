package com.anup.threading;

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 th1 = new MyThread1(obj);
        MyThread3 th3 = new MyThread3(obj);
        th1.start();
        th3.start();
    }
}
class Table{
    void printTable(int n){
        for (int i = 1; i <= 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread3 extends Thread{
    Table t;
    MyThread3(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

