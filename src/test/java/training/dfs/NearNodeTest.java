package training.dfs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class NearNodeTest {

    @Test
    void 성공() {
        //given:
        int[] nums = { 0, 1,
                       0, 2,
                       1, 3,
                       1, 4,
                       2, 4,
                       3, 4 };
        //when:
        NearNode nearNode = new NearNode(nums);
        int[] result = nearNode.visit();
        Arrays.stream(result).forEach(System.out::println);
        //then:
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(1);
        assertThat(result[2]).isEqualTo(3);
        assertThat(result[3]).isEqualTo(4);
        assertThat(result[4]).isEqualTo(2);
    }
}
