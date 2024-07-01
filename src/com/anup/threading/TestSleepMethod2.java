package com.anup.threading;

public class TestSleepMethod2 extends Thread{
    public static void main(String[] args) {
        try{
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);//time cannot be in negative value
                System.out.println(i);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
