package com.soongjamm.helper;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LimitedNumberTest {

    @ParameterizedTest
    @CsvSource(value = {"-1, 1, -1", "-1, 1, 1", "-1, 1, 0"})
    void min_max_range_test(int min, int max, int value) {
        NumberRange numberRange = new NumberRange(min, max);

        assertDoesNotThrow(() -> new LimitedNumber(numberRange, value));
    }

    @ParameterizedTest
    @CsvSource(value = {"-1, 1, 2", "-1, 1, -2"})
    void min_max_range_fail_test(int min, int max, int value) {
        NumberRange numberRange = new NumberRange(min, max);

        assertThrows(IllegalArgumentException.class, () -> new LimitedNumber(numberRange, value));
    }

}
