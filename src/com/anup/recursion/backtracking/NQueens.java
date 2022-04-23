package com.anup.recursion.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));

    }

    static int nQueens(boolean[][] board, int row) {
        if(row == board.length) {
            displayBoard(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //place the queen and check for every  row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] =  true;
                count += nQueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //check for left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]) {
                return false;
            }
        }
        //check for the right diagonal
        int rightMax = Math.min(row, board.length - col - 1);
        for (int i = 1; i<= rightMax; i++) {
            if(board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static void displayBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if(element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
