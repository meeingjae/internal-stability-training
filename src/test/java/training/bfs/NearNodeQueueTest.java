package training.bfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NearNodeQueueTest {
    @Test
    void 성공() {
        //given:
        int[] nodes = { 0, 1, 0, 2, 1, 3, 1, 4, 2, 4, 3, 4 };
        //when:
        NearNodeQueue nearNodeQueue = new NearNodeQueue(nodes);
        int[] result = nearNodeQueue.visit();
        //then:
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(1);
        assertThat(result[2]).isEqualTo(2);
        assertThat(result[3]).isEqualTo(3);
        assertThat(result[4]).isEqualTo(4);

    }
}
