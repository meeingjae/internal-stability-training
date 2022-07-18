package training.recursive;

import org.junit.jupiter.api.Test;

public class CrossFillTest {

    @Test
    void 성공() {
        CrossFill board = new CrossFill(10,10);
        board.makeBoard();

        board.printBoard();

        board.fill(3,2);

        System.out.println();
        board.printBoard();
    }
}
