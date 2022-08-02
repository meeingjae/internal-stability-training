package training.exhaustive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaxSumNumberTest {

    @Test
    void 성공() {
        //given:
        int[] nums = { 1, 4, 6, 3, 8, 9, 5, 9 };
        int pickSize = 3;
        //when:
        MaxSumNumber maxSumNumber = new MaxSumNumber(nums, pickSize);
        int result = maxSumNumber.max();
        //then:
        assertThat(result).isEqualTo(998);
    }
}
