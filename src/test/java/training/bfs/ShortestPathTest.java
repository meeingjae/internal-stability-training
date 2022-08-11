package training.bfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ShortestPathTest {

    final int boardRow = 10;
    final int boardCol = 10;

    @Test
    void 성공() {
        //given:
        int sourceRow = 2;  // 시작 열
        int sourceCol = 2;  // 시작 행

        int targetRow = 7;  // 도착 열
        int targetCol = 3;  // 도착 행

        //when:
        ShortestPath shortestPath = new ShortestPath(boardRow, boardCol);
        shortestPath.walk();
        int cost = shortestPath.getCost();
        //then:
        assertThat(cost).isNotEqualTo(0);
    }
}
