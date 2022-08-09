package training.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FloodFillTest {

    private final int BOARD_COL = 5;
    private final int BOARD_ROW = 10;

    @Test
    void 성공() {
        //given:
        FloodFill floodFill = new FloodFill(BOARD_COL, BOARD_ROW);
        int pointCol = 3;   // 색칠 기준 행
        int pointRow = 3;   // 색칠 기준 열
        int fillNum = 5;    // 색칠할 숫자
        //when:
        floodFill.generateBoard();
        floodFill.printBoard();
        System.out.println();

        floodFill.fill(pointCol, pointRow, fillNum);
        floodFill.printBoard();

        int[][] result = floodFill.getBoard();
        //then:
        assertThat(result[BOARD_COL - 1][BOARD_ROW - 1]).isNotEqualTo(0);
        assertThat(result[pointCol][pointRow]).isNotEqualTo(0);
    }
}
