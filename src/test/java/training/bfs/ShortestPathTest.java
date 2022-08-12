package training.bfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ShortestPathTest {

    final int boardRow = 10;
    final int boardCol = 10;

    @Test
    void 성공() {
        //given:
        int sourceRow = 0;  // 시작 열
        int sourceCol = 0;  // 시작 행

        int targetRow = 9;  // 도착 열
        int targetCol = 9;  // 도착 행

        //when:
        ShortestPath shortestPath = new ShortestPath(boardRow, boardCol);
        shortestPath.printBoard();
        shortestPath.walk(sourceRow, sourceCol, targetRow, targetCol);
        int cost = shortestPath.getCost();
        System.out.println("cost: " + cost);
        //then:
        assertThat(cost).isNotEqualTo(0);
    }

    @Test
    void 성공_fixed() {
        //given:
        int[][] board = {
                { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0 }
        };
        int sourceRow = 0;  // 시작 열
        int sourceCol = 1;  // 시작 행

        int targetRow = 4;  // 도착 열
        int targetCol = 2;  // 도착 행

        //when:
        ShortestPath shortestPath = new ShortestPath(board);
        shortestPath.printBoard();
        shortestPath.walk(sourceRow, sourceCol, targetRow, targetCol);
        int cost = shortestPath.getCost();
        System.out.println("cost: " + cost);
        //then:
        assertThat(cost).isEqualTo(11);
    }
}
