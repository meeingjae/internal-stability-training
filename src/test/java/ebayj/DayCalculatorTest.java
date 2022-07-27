package ebayj;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DayCalculatorTest {

    @Test
    void afterTest() {
        //given:
        int sourceDate = 1;
        String sourceDay = "MON";
        int targetDate = 2;
        //when:
        String resultDay = DayCalculator.calculateDate(sourceDate, sourceDay, targetDate);
        //then:
        assertThat(resultDay).isEqualTo("TUE");
    }
}
