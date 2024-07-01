package com.anup.threading;
//creating out thread with Runnable Interface
public class MyThread implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i in thread1:"+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        //calling the thread in MyThread class
        MyThread thrObj = new MyThread();
        Thread thread1 = new Thread(thrObj);
        thread1.start();

        //calling the thread in MyThread2 class
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }

}
