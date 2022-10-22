package com.soongjamm.coordinate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DefaultPointTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10, 15, 20, 24})
    void create_point(int value) {
        assertDoesNotThrow(() -> new DefaultPoint(value));
    }

}
