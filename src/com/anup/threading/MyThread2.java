package com.anup.threading;
//creating thread with Thread class
public class MyThread2 extends Thread{
    public void run(){
        for (int i = 10; i >0 ; i--) {
            System.out.println("thread2 with i:"+i);
            try{
                Thread.sleep(5000);
            }catch(Exception e){

            }
        }
    }
}
