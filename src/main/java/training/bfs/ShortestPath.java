package training.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShortestPath {
    private int[][] board;
    private final int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
    private int cost;

    public ShortestPath(int boardRow, int boardCol) {
        setBoard(boardRow, boardCol);
        generateBoard();
    }

    public ShortestPath(int[][] board) {
        this.board = board;
    }

    private void setBoard(int boardRow, int boardCol) {
        final int defaultValue = 10;
        this.board = new int[boardRow != 0 ? boardRow : defaultValue][boardCol != 0 ? boardCol : defaultValue];
    }

    private void generateBoard() {
        Random random = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (random.nextInt() % 10 > 4) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public void walk(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        boolean[][] visit = new boolean[board.length][board[0].length];
        Point cur = new Point(sourceRow, sourceCol, 0);
        Queue<Point> visitQueue = new LinkedList<>();

        if (sourceRow != targetRow || sourceCol != targetCol) {
            visit[sourceRow][sourceCol] = true;
            visitQueue.add(cur);
        }

        while (!visitQueue.isEmpty()) {
            Point now = visitQueue.remove();

            if (now.getRow() == targetRow && now.getCol() == targetCol) {
                this.cost = now.getCost();
            }
            for (int i = 0; i < direction.length; i++) {
                int currentRow = now.getRow() + direction[i][0];
                int currentCol = now.getCol() + direction[i][1];

                if (currentRow < 0 || currentRow >= board.length ||
                    currentCol < 0 || currentCol >= board[0].length) {
                    continue;
                }
                if (visit[currentRow][currentCol]) {
                    continue;
                }
                if (board[currentRow][currentCol] != 0) {
                    continue;
                }
                visit[currentRow][currentCol] = true;
                visitQueue.add(new Point(currentRow, currentCol, now.getCost() + 1));
            }
        }
        if (cost == 0) {
            cost = -1;
        }
    }

    public int getCost() {
        return this.cost;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    class Point {
        private int row;
        private int col;
        private int cost;

        public Point(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int getCost() {
            return cost;
        }
    }
}
