package training.bit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SumCaseTest {

    @Test
    void 성공() {
        //given:
        int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //1~9 숫자 집합의
        int bitCount = 2; //두 수의 합이
        int expectSum = 8; // 합이 8인 것
        //when:
        SumCase sumCase = new SumCase(source, bitCount, expectSum);
        sumCase.expect();
        List<int[]> resultList = sumCase.getResults();
        sumCase.printResult();
        int resultCount = sumCase.getResultCount();
        //then:
        assertThat(resultCount).isEqualTo(3);
    }
}
