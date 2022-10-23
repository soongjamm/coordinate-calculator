package com.soongjamm.number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AddTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1000, 1000",
            "1, 100, 101",
            "2, 2, 4", "2, 3, 5",
            "3, 1, 4", "3, 2, 5", "3, 3, 6", "3, 4, 7" })
    void int_calculate(int one, int other, int result) {
        Add sut = new Add(one, other);

        assertThat(sut.intValue()).isEqualTo(result);
    }
}