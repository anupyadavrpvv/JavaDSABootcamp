package com.anup.recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(noOfPaths(3, 3));
////        printPaths("", 3, 3);
////        System.out.println(returnPossiblePaths("", 3, 3));
//        System.out.println(pathRetDiagonal("", 3, 3));

        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        pathWithObstacles(maze, "", 0, 0);
    }

    static int noOfPaths(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }
//        int left = noOfPaths(r-1, c);
//        int right = noOfPaths(r, c-1);
//        return left + right;

        //OR
        return noOfPaths(r-1, c) + noOfPaths(r, c-1);
    }

    //print the possible paths
    static void printPaths(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r > 1)
            printPaths(p + 'D', r-1, c);
        if(c > 1)
            printPaths(p + 'R', r, c-1);

    }

    //return the possible paths in an ArrayList
    static ArrayList<String> returnPossiblePaths(String path, int r, int c){
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1)
            ans.addAll(returnPossiblePaths(path +'D', r-1, c));
        if(c > 1)
            ans.addAll(returnPossiblePaths(path + 'R', r, c-1));
        return ans;

    }

    //if we can go diagonally as well
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1 && c > 1) {
            ans.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }
        if(r > 1) {
            ans.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }
        if(c > 1) {
            ans.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }

        return ans;
    }

    //possible paths with an obstacle present in the matrix
    static void pathWithObstacles(boolean[][] maze, String path, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length -1) {
            System.out.println(path);
            return;
        }
        if(maze[r][c]==false) {
            return;
        }
        if(r < maze.length - 1) {
            pathWithObstacles(maze, path + 'D', r +1 , c);
        }
        if(c < maze[0].length -1) {
            pathWithObstacles(maze, path + 'R', r, c + 1);
        }
    }
}
