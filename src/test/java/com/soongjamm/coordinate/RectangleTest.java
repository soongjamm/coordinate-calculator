package com.soongjamm.coordinate;

import com.soongjamm.figure.Rectangle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

    @Test
    void square_area() {
        Coordinate c1 = new Coordinate("10", "10");
        Coordinate c2 = new Coordinate("22", "10");
        Coordinate c3 = new Coordinate("22", "18");
        Coordinate c4 = new Coordinate("10", "18");

        Rectangle sut = new Rectangle(c1, c2, c3, c4);

        assertThat(sut.area().intValue()).isEqualTo(96);
    }

}
