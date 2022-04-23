package com.anup.recursion.permutations;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("",4);
//        System.out.println(diceList("",4));
        System.out.println(diceFace("", 7, 8));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p + i,target-i);
        }
    }

    static ArrayList<String> diceList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            ans.addAll(diceList(p + i,target-i));
        }
        return ans;
    }

    //when the number of faces of the dice is given
    static ArrayList<String> diceFace(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target ; i++) {
            ans.addAll(diceFace(p + i,target-i, face));
        }
        return ans;
    }
}
