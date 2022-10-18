package com.soongjamm.helper;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberRangeTest {

    @ParameterizedTest
    @CsvSource(value = {"-1, 1, -1", "-1, 1, 1", "-1, 1, 0"})
    void contains_true_test(int min, int max, int value) {
        NumberRange sut = new NumberRange(min, max);

        boolean result = sut.contains(value);

        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"-1, 1, 2", "-1, 1, -2"})
    void contains_false_test(int min, int max, int value) {
        NumberRange sut = new NumberRange(min, max);

        boolean result = sut.contains(value);

        assertThat(result).isFalse();
    }
}
