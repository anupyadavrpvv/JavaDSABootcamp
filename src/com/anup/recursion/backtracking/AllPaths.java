package com.anup.recursion.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPossiblePaths(maze, "", 0, 0);
        int[][] matrix = new int[maze.length][maze[0].length];
        printAllPossiblePaths(maze, "", 0, 0, matrix, 1);
    }

    //if we are allowed to move in all direction in the matrix
    static void allPossiblePaths(boolean[][] maze, String path, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length -1) {
            System.out.println(path);
            return;
        }
        if(maze[r][c]==false) {
            return;
        }
        //mark the visited box false
        maze[r][c] = false;
        if(r < maze.length - 1) {
            allPossiblePaths(maze, path + 'D', r + 1 , c);
        }
        if(c < maze[0].length -1) {
            allPossiblePaths(maze, path + 'R', r, c + 1);
        }
        if(r > 0) {
            allPossiblePaths(maze, path + 'U', r - 1 , c);
        }
        if(c > 0) {
            allPossiblePaths(maze, path + 'L', r , c - 1);
        }
        //while returning the answer we should also make the matrix how it was earlier
        //we will mark the visited box true again to maintain the correctness
        //this is known as backtracking
        maze[r][c] = true;
    }

    //here we are also printing the matrix with paths
    static void printAllPossiblePaths(boolean[][] maze, String path, int r, int c, int[][] mat, int step) {
        if(r == maze.length - 1 && c == maze[0].length -1) {
            for (int[] arr :
                    mat) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        if(maze[r][c]==false) {
            return;
        }
        //mark the visited box false
        maze[r][c] = false;
        //mark the step at that index of the matrix
        mat[r][c] = step;
        if(r < maze.length - 1) {
            printAllPossiblePaths(maze, path + 'D', r + 1 , c, mat, step + 1);
        }
        if(c < maze[0].length -1) {
            printAllPossiblePaths(maze, path + 'R', r, c + 1, mat, step + 1);
        }
        if(r > 0) {
            printAllPossiblePaths(maze, path + 'U', r - 1 , c, mat, step + 1);
        }
        if(c > 0) {
            printAllPossiblePaths(maze, path + 'L', r , c - 1, mat, step + 1);
        }
        //while returning the answer we should also make the matrix how it was earlier
        //we will mark the visited box true again to maintain the correctness
        //this is known as backtracking
        maze[r][c] = true;
        //we make the step at that index back to 0
        mat[r][c] = 0;
    }

}
