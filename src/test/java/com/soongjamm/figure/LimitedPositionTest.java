package com.soongjamm.figure;

import com.soongjamm.number.NumberRange;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LimitedPositionTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 25})
    void limited_range_fail_check_negative_or_gte_25(int value) {
        NumberRange numberRange = new NumberRange(0, 24);

        assertThrows(IllegalArgumentException.class, () -> new LimitedPosition(numberRange, value));
    }

    @ParameterizedTest
    @CsvSource(value = {"-1, 1, -1", "-1, 1, 1", "-1, 1, 0"})
    void min_max_range_test(int min, int max, int value) {
        NumberRange numberRange = new NumberRange(min, max);

        assertDoesNotThrow(() -> new LimitedPosition(numberRange, value));
    }

    @ParameterizedTest
    @CsvSource(value = {"-1, 1, 2", "-1, 1, -2"})
    void min_max_range_fail_test(int min, int max, int value) {
        NumberRange numberRange = new NumberRange(min, max);

        assertThrows(IllegalArgumentException.class, () -> new LimitedPosition(numberRange, value));
    }
}
