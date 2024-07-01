package com.anup.arrays;

public class SingletonExample {
    public static void main(String[] args) {
        SExample newOBj = SExample.getInstance();

    }
}

class SExample{
    private SExample(){

    }
    static SExample obj = null;
    public static SExample getInstance(){
        if(obj == null){
            return new SExample();
        }
        return obj;
    }
}
