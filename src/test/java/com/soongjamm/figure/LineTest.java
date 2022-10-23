package com.soongjamm.figure;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LineTest {

    @Test
    void create_line() {
        Point point1 = new Point("1", "1");
        Point point2 = new Point("2", "2");

        assertDoesNotThrow(() -> new Line(point1, point2));
    }

    @Test
    void calculate_length() {
        Point point1 = new Point("10", "10");
        Point point2 = new Point("14", "15");
        Line sut = new Line(point1, point2);

        Number result = sut.length();

        assertThat(result.doubleValue()).isEqualTo(6.403124, offset(0.0000009));
    }
}
