package com.soongjamm.number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DifferenceTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 1",
            "2, 1, 1",
            "1, 100, 99",
            "30, 30, 0"})
    void int_calculate(int one, int other, int result) {
        Difference sut = new Difference(one, other);

        assertThat(sut.intValue()).isEqualTo(result);
    }
}