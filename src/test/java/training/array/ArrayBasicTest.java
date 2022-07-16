package training.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

public class ArrayBasicTest {

    @Test
    void Array_선언() {

        int[] scoreEmpty = new int[5];
        int[] scoreFill = { 1, 2, 3, 4, 5 };

        assertThat(scoreEmpty.length).isEqualTo(scoreFill.length);
    }

    @Test
    void Array_선언_2차원() {

        int[][] scoreEmpty = new int[4][5];
        int[][] scoreFill = {
                { 1, 2, 3, 4, 5 },
                { 2, 3, 4, 5, 6 },
                { 3, 4, 5, 6, 7 },
                { 4, 5, 6, 7, 8 } };

        assertThat(scoreEmpty.length).isEqualTo(scoreFill.length);
        assertThat(scoreFill[1][1]).isEqualTo(3);
    }

    @Test
    void Array_순회_2차원_1() {
        final int COL_NUM = 5;
        final int ROW_NUM = 10;
        int[][] score = new int[COL_NUM][ROW_NUM];

        for(int i =0; i< COL_NUM; i++) {
            for(int j=0; j < ROW_NUM; j++) {
                score[i][j] = i+j;
            }
        }
        assertThat(score[1][2]).isEqualTo(3);
        assertThat(score[0][0]).isEqualTo(0);
        assertThatThrownBy(() -> System.out.println(score[5][0])).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }


}
