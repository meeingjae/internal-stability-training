package training.bit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BitSubsetTest {

    @Test
    void 성공() {
        //given:
        String[] source = {"minjae","inni","kihyun","hodu","ddangkong"};
        //when:
        BitSubset subset = new BitSubset(source);
        subset.gather();
        subset.print();
        //then:
        assertThat(subset.getTotalCount()).isEqualTo(32);
    }
}
