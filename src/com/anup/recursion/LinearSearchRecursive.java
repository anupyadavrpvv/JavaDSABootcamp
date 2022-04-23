package com.anup.recursion;

import java.util.ArrayList;

public class LinearSearchRecursive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexFromLast(arr, 4, arr.length-1));
        System.out.println(findMultipleOccurrence(arr, 4, 0));
        System.out.println(findMultipleOccurrence2(arr, 4, 0));
    }
    //finding the element
    static boolean find(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    //finding the index of the element
    static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    //find the index of the element from last
    static int findIndexFromLast(int[] arr, int target,int index) {
        if(index == -1)
            return -1;
        if(arr[index] == target)
            return index;
        return findIndexFromLast(arr, target, index-1);
    }

    //find multiple occurrence of the element
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findMultipleOccurrence(int[] arr, int target, int index) {
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return findMultipleOccurrence(arr, target, index+1);
    }

    //return the list of occurrences without using and external ArrayList
    //this is not optimal as it creates new object(of ArrayList) on each call of the function
    static ArrayList<Integer> findMultipleOccurrence2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;

        if(arr[index] == target)
            list.add(index);
//        ArrayList<Integer> ansFromBelowCalls = findMultipleOccurrence2(arr, target, index+1);
//        list.addAll(ansFromBelowCalls);
        list.addAll(findMultipleOccurrence2(arr, target,index+1));
        return list;
    }


}
