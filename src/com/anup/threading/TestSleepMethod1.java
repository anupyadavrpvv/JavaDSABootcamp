package com.anup.threading;

import java.time.format.TextStyle;

public class TestSleepMethod1 extends Thread {
    public void run(){
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod1 th1 = new TestSleepMethod1();
        TestSleepMethod1 th2 = new TestSleepMethod1();
        th1.start();
        th2.start();
    }

}
