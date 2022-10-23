package com.soongjamm.number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class QuadrangleRootTest {

    @ParameterizedTest
    @CsvSource({
            "4, 2",
            "5, 2.236",
            "6, 2.449",
            "16, 4"})
    void double_calculate(int value, double result) {
        SquareRoot sut = new SquareRoot(value);

        assertThat(sut.doubleValue()).isEqualTo(result, offset(0.0009));
    }
}