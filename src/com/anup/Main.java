package com.anup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        /*int[] arr={2,4,5,8,7};
        //insertion
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //search in array
        for (int i=0;i<arr.length;i++){
            if(arr[i]==8) {
                System.out.println(i);
                break;
            }
        }
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/


        Integer value= 10;
        System.out.println(fetchNextNumber(value));

    }

    public static int fetchNextNumber(int n){
        int digitSum= sumOfDigits(n);
        while(digitSum >9 ){
            digitSum = sumOfDigits(digitSum);
        }
        if(digitSum == 1){
            fetchNextNumber(n + 1);
        }
        return n + (10 - digitSum);
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n != 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
