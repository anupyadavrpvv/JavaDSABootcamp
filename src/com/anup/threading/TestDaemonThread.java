package com.anup.threading;

public class TestDaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        TestDaemonThread t1=new TestDaemonThread();//creating thread
        TestDaemonThread t2=new TestDaemonThread();
        TestDaemonThread t3=new TestDaemonThread();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
        //now can't assign it as Daemon thread because
        //after starting the thread it became a user thread
        //and user thread can't be assigned as Daemon thread
        //after it's started
//        t2.setDaemon(true);
        t3.start();
    }
}
