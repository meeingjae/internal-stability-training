package training.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NearNodeStackTest {

    @Test
    void 성공() {
        //given:
        int nums[] = { 0, 3, 0, 5, 3, 7, 3, 9, 5, 9, 7, 9 };
        //when:
        NearNodeStack nearNodeStack = new NearNodeStack(nums);
        int[] result = nearNodeStack.visit();
        //then:
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(5);
        assertThat(result[2]).isEqualTo(9);
        assertThat(result[3]).isEqualTo(7);
        assertThat(result[4]).isEqualTo(3);
    }
}
