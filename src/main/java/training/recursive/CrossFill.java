package training.recursive;

import java.util.Random;

public class CrossFill {
    private int[][] board;

    public CrossFill(int row, int col) {
        this.board = new int[row][col];
    }

    public void makeBoard() {
        Random random = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (Math.ceil(random.nextInt() % 10) > 8) {
                    board[i][j] = 2;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fill(int row, int col) {
        if(board[row][col] == 0) {
            board[row][col] = 1;
            if(col + 1 < board[0].length) {
                fill(row, col+1);
            }
            if(col - 1 >= 0) {
                fill(row, col-1);
            }
            if(row + 1 < board.length) {
                fill(row+1, col);
            }
            if(row - 1 >= 0) {
                fill(row-1, col);
            }
        }
    }
}
