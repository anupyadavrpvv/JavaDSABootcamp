package com.anup.threading;

public class ThreadJoinExample extends Thread{
    public static void main(String[] args) {
        ThreadJoin th1 = new ThreadJoin("Anup");
        ThreadJoin th2 = new ThreadJoin("Anuj");
        ThreadJoin th3 = new ThreadJoin("Ankush");

        th1.start();
        //setting the thread name
        //th1.setName("Anup Thread");
        try{
            //Thread.currentThread returns the current thread object
            System.out.println("current thread name is: "+Thread.currentThread().getName());
            //invoking join method on th1
            th1.join();
        }catch (Exception e){
            System.out.println("Exception caught: "+e);
        }

        // thread th2 starts
        th2.start();

        // starting the th3 thread after when the thread th2 has ended or died.
        try
        {
            System.out.println("current thread name is: " + Thread.currentThread().getName());

            th2.join(5000);
        }catch(Exception e)
        {
            System.out.println("Exception has been caught " + e);
        }

        // thread th3 starts
        th3.start();
    }
}

class ThreadJoin extends Thread{
    //Constructor of the class to name the thread
    ThreadJoin(String threadName){
        //invoking the constructor of the superclass i.e. Thread class
        super(threadName);
    }
    public void run(){
        for (int i = 1; i <=5; i++) {
            try{
                Thread.sleep(500);
                System.out.println("current thread name is "+Thread.currentThread().getName());
            }catch(Exception e){
                System.out.println("Exception has been caught "+e);
            }
            System.out.println(i);
        }
    }
}
