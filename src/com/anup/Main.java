package com.anup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int[] arr={2,4,5,8,7};
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
        }
    }
}
