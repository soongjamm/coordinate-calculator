package com.soongjamm.coordinate;

import com.soongjamm.helper.LimitedNumber;
import com.soongjamm.helper.NumberRange;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PointTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10, 15, 20, 24})
    void range_check_zero_to_24(int value) {
        assertDoesNotThrow(() -> new Point(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 25})
    void limited_range_fail_check_negative_or_gte_25(int value) {
        LimitedNumber limitedNumber = new LimitedNumber(new NumberRange(0, 24), value);

        assertThrows(IllegalArgumentException.class, () -> new Point(limitedNumber));
    }
}
