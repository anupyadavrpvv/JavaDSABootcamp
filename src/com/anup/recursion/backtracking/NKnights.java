package com.anup.recursion.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        System.out.println(nKnights(board, 0, 0, 3));;
    }

    static int nKnights(boolean[][] board, int row, int col, int knights) {
        if(knights == 0) {
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //condition for out of bound then just skip it
        if(row == board.length - 1 && col == board.length - 1) {
            return 0;
        }
        //if it hits the right wall of the matrix
        if(col == board.length) {
            return nKnights(board, row + 1, 0, knights);
        }
        if(isSafe(board, row, col)) {
            board[row][col] = true;
            count += nKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        count += nKnights(board, row, col + 1, knights);
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col - 1)) {
            if(board[row - 2][col - 1]) {
                return false;
            }
        }
        if(isValid(board, row - 2, col + 1)) {
            if(board[row - 2][col + 1]) {
                return false;
            }
        }
        if(isValid(board, row - 1, col - 2)) {
            if(board[row - 1][col - 2]) {
                return false;
            }
        }
        if(isValid(board, row - 1, col + 2)) {
            if(board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }
    //condition to check for valid row and col for the matrix
    static boolean isValid(boolean[][] board, int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void displayBoard(boolean[][] board) {
        for (boolean[] row :
                board) {
            for (boolean element :
                    row) {
                if(element)
                    System.out.print("K ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
