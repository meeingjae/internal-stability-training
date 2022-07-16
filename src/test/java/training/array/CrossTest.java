package training.array;

import org.junit.jupiter.api.Test;

public class CrossTest {

    @Test
    void 성공() {
        Cross cross = new Cross(10,10);
        cross.makeBoard();

        System.out.println("-- before --");
        cross.printBoard();
        System.out.println();

        cross.fillCross(2,3);

        System.out.println("-- after --");
        cross.printBoard();
    }
}
