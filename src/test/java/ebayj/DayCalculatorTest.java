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

    @Test
    void beforeTest() {
        //given:
        int sourceDate = 3;
        String sourceDay = "MON";
        int targetDate = 1;
        //when:
        String resultDay = DayCalculator.calculateDate(sourceDate, sourceDay, targetDate);
        //then:
        assertThat(resultDay).isEqualTo("SAT");
    }

    @Test
    void beforeComplexTest() {
        //given:
        int sourceDate = 24;
        String sourceDay = "WED";
        int targetDate = 15;
        //when:
        String resultDay = DayCalculator.calculateDate(sourceDate, sourceDay, targetDate);
        //then:
        assertThat(resultDay).isEqualTo("MON");
    }
}
