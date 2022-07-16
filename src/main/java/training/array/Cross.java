package training.array;

import java.util.Random;

public class Cross {
    private int[][] board;

    public Cross(int col, int row) {
        this.board = new int[col][row];
    }

    public void makeBoard() {
        Random random = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (Math.ceil(random.nextInt() % 10) > 7) {
                    board[i][j] = 2;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public void printBoard() {
        for (int[] ints : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public void fillCross(int startCol, int startRow) {
        int boardColSize = board.length;
        int boardRowSize = board[0].length;

        if(board[startCol][startRow] == 0) {
            board[startCol][startRow] =1;
        }

        for (int i = startCol - 1; i >= 0; i--) {
            if (board[i][startRow] != 0) {
                break;
            } else {
                board[i][startRow] = 1;
            }
        }

        for (int i = startCol + 1; i < board[0].length; i++) {
            if (board[i][startRow] != 0) {
                break;
            } else {
                board[i][startRow] = 1;
            }
        }

        for (int i = startRow - 1; i >= 0; i--) {
            if (board[startCol][i] != 0) {
                break;
            } else {
                board[startCol][i] = 1;
            }
        }

        for (int i = startRow + 1; i < board.length; i++) {
            if (board[startCol][i] != 0) {
                break;
            } else {
                board[startCol][i] = 1;
            }
        }
    }
}
