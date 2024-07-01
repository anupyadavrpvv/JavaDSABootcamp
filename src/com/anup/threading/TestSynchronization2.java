package com.anup.threading;

public class TestSynchronization2 {
    public static void main(String[] args) {
        TableSynchronized obj = new TableSynchronized();
        MyThread4 th4 = new MyThread4(obj);
        MyThread5 th5 = new MyThread5(obj);
        th4.start();
        th5.start();
    }
}
class TableSynchronized{
    synchronized void printTable(int n){
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
class MyThread4 extends Thread {
    TableSynchronized t;
    MyThread4(TableSynchronized t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread5 extends Thread{
    TableSynchronized t;
    MyThread5(TableSynchronized t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

