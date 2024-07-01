package com.anup.threading;

public class TestSynchronizedBlock1{
public static void main(String args[]){
    TableSychronizedBlock obj = new TableSychronizedBlock();//only one object
MyThread6 t6=new MyThread6(obj);
MyThread7 t7=new MyThread7(obj);
t6.start();
t7.start();
}    
}

class TableSychronizedBlock {
    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }
}
class MyThread6 extends Thread {
    TableSychronizedBlock t;
    MyThread6(TableSychronizedBlock t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread7 extends Thread{
    TableSychronizedBlock t;
    MyThread7(TableSychronizedBlock t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}