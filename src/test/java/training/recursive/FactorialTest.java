package training.recursive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void 성공() {
        Factorial factorial = new Factorial(5);
        int result = factorial.execute();
        assertThat(result)
                .isEqualTo(120);
    }
}
