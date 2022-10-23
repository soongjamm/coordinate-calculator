package com.soongjamm.number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PowerTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1000, 0",
            "1, 100, 1",
            "2, 2, 4", "2, 3, 8",
            "3, 1, 3", "3, 2, 9", "3, 3, 27", "3, 4, 81" })
    void int_calculate(int base, int exponent, int result) {
        Power sut = new Power(base, exponent);

        assertThat(sut.intValue()).isEqualTo(result);
    }


    @ParameterizedTest
    @CsvSource({
            "0, 1000, 0",
            "1, 100, 1",
            "2, 2, 4", "2, 3, 8",
            "3, 1, 3", "3, 2, 9", "3, 3, 27", "3, 4, 81" })
    void double_calculate(double base, double exponent, int result) {
        Power sut = new Power(base, exponent);

        assertThat(sut.doubleValue()).isEqualTo(result);
    }
}