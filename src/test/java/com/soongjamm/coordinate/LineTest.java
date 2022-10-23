package com.soongjamm.coordinate;

import com.soongjamm.figure.Line;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LineTest {

    @Test
    void create_line() {
        Coordinate coordinate1 = new Coordinate("1", "1");
        Coordinate coordinate2 = new Coordinate("2", "2");

        assertDoesNotThrow(() -> new Line(coordinate1, coordinate2));
    }

    @Test
    void calculate_length() {
        Coordinate coordinate1 = new Coordinate("10", "10");
        Coordinate coordinate2 = new Coordinate("14", "15");
        Line sut = new Line(coordinate1, coordinate2);

        Number result = sut.length();

        assertThat(result.doubleValue()).isEqualTo(6.403124, offset(0.0000009));
    }
}
