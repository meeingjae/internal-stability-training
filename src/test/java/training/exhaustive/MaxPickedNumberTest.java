package training.exhaustive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaxPickedNumberTest {

    @Test
    void 성공() {
        //given:
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int pickSize = 3;
        //when:
        MaxPickedNumber maxPickedNumber = new MaxPickedNumber(nums, pickSize);
        int maxNum = maxPickedNumber.max();
        //then:
        assertThat(maxNum).isEqualTo(987);
    }
}
