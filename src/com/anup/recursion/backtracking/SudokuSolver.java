package com.anup.recursion.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("Can't be solved!!!!!!!!!!!1");
        }
    }

    static boolean solveSudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        //this is how we are replacing the r, c in the arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in the row, then break;
            if(!emptyLeft) {
                break;
            }
        }
        if(emptyLeft){
            return true;
        }
        //backtrack
        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(board, row, col, number)) {
                board[row][col] = number;
                if(solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int number) {
        //check in the current row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == number) {
                return false;
            }
        }
        //check in the current column
        for (int[] num : board) {
            if(num[col] == number) {
                return false;
            }
        }
        //check in the current square
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < row + sqrt ; r++) {
            for (int c = colStart; c < colStart; c++) {
                if(board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    //function to print the board
    static void printBoard(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
