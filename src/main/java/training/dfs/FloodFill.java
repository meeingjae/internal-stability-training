package training.dfs;

import java.util.Random;
import java.util.Stack;

public class FloodFill {
    private int[][] board;
    private final int[][] moves = {
            { -1, 0 },
            { 1, 0 },
            { 0, 1 },
            { 0, -1 }
    };

    public FloodFill(int board_col, int board_row) {
        board = new int[board_col][board_row];
    }

    public void generateBoard() {
        Random random = new Random();
        int randomIndex = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                randomIndex = random.nextInt() % 10;
                if (randomIndex > 7) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public void fill(int pointRow, int pointCol, int fillNum) {
        boolean[][] visit = new boolean[board.length][board[0].length];
        Stack<Point> visitStack = new Stack<>();
        visitStack.push(new Point(pointRow, pointCol));

        while (!visitStack.isEmpty()) {
            Point curPoint = visitStack.pop();
            if (visit[curPoint.getRow()][curPoint.getCol()]) {
                continue;
            }

            visit[curPoint.getRow()][curPoint.getCol()] = true;
            board[curPoint.getRow()][curPoint.getCol()] = fillNum;

            for (int i = 0; i < moves.length; i++) {
                int moveRow = curPoint.getRow() + moves[i][0];
                int moveCol = curPoint.getCol() + moves[i][1];
                if (moveRow < 0 ||
                    moveRow >= board.length ||
                    moveCol < 0 ||
                    moveCol >= board[0].length) {
                    continue;
                }
                if (visit[moveRow][moveCol]) {
                    continue;
                }
                if (board[moveRow][moveCol] != 0) {
                    continue;
                }
                visitStack.push(new Point(moveRow, moveCol));
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

    public int[][] getBoard() {
        return board;
    }

    static class Point {
        int col, row;

        public Point(int row, int col) {
            this.col = col;
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public int getRow() {
            return row;
        }
    }
}
